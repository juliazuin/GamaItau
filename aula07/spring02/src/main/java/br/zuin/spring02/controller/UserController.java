package br.zuin.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.zuin.spring02.dto.UserDto;
import br.zuin.spring02.model.User;
import br.zuin.spring02.repo.UserRepo;

@RestController
@CrossOrigin("*") // aceita requisições de outras origens
@RequestMapping("/user")
public class UserController {

    @Autowired // injecao
    private UserRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable int id) {
        User usuario = repo.findById(id).orElse(null);

        UserDto usuariodto = new UserDto(usuario);

        if (usuario != null) {
            return ResponseEntity.ok(usuariodto); // OK == 200
        }

        // return ResponseEntity.notFound().build();
        return ResponseEntity.status(400).build();

    }

    @GetMapping("/all")
    public List<User> getAll() {
        List<User> lista = (List<User>) repo.findAll();
        return lista;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User userParam) {
        // User user = repo.findByEmailAndSenha(userParam.getEmail(),
        // userParam.getSenha());
        User user = repo.findByEmailOrCpf(userParam.getEmail(), userParam.getCpf());

        if (user != null) {
            if (userParam.getSenha().equals(user.getSenha())) {
                return ResponseEntity.ok(user); // OK == 200
            }
        }
        return ResponseEntity.status(404).build();
    }

    @PostMapping("/new")
    public User insertUser(@RequestBody User newUser) {
        User user = repo.save(newUser);

        return user;
    }

    @PutMapping()
    public ResponseEntity<Void> updateUser(@RequestBody User user) {
        User userBd = repo.findById(user.getId()).orElse(null);

        if (userBd != null) {
            repo.save(userBd);
            ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("id/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        User userBd = repo.findById(id).orElse(null);

        if (userBd != null) {
            repo.deleteById(id);
            ;
            ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/id2/{id}")
    public ResponseEntity<User> getUser2(@PathVariable int id) {
        User usuario = repo.buscaPorId(id);

        if (usuario != null) {
            return ResponseEntity.ok(usuario); // OK == 200
        }

        // return ResponseEntity.notFound().build();
        return ResponseEntity.status(400).build();

    }

}
