package br.zuin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.zuin.demo.Models.Usuario;
import br.zuin.demo.repo.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam) {
        // User user = repo.findByEmailAndSenha(userParam.getEmail(),
        // userParam.getSenha());
        Usuario user = repo.findByEmailOrRacf(userParam.getEmail(), userParam.getRacf());

        if (user != null) {
            if (userParam.getSenha().equals(user.getSenha())) {
                return ResponseEntity.ok(user); // OK == 200
            }
        }
        return ResponseEntity.status(401).build();
    }
}
