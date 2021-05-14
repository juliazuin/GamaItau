package br.zuin.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.zuin.demo.Models.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}
