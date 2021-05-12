package br.zuin.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.zuin.spring02.model.Conta;
import br.zuin.spring02.repo.ContaRepo;

@RestController
@CrossOrigin("*") // aceita requisições de outras origens
@RequestMapping("/conta")
public class ContaController {

    @Autowired // injecao
    private ContaRepo repo;

    @GetMapping("/numero/{numero}")
    public ResponseEntity<Conta> getConta(@PathVariable int numero) {
        Conta conta = repo.findById(numero).orElse(null);

        if (conta != null) {
            return ResponseEntity.ok(conta); // OK == 200
        }

        // return ResponseEntity.notFound().build();
        return ResponseEntity.status(400).build();
    }

    @GetMapping("/all")
    public List<Conta> getAll() {
        List<Conta> lista = (List<Conta>) repo.findAll();
        return lista;
    }

    @PostMapping("/new")
    public Conta insertUser(@RequestBody Conta conta) {
        Conta newConta = repo.save(conta);

        return newConta;
    }

}
