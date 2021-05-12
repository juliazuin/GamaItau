package br.zuin.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.zuin.spring02.model.User;

// CRUD - Create, Read, Update e Delete
public interface UserRepo extends CrudRepository<User, Integer> {

    public User findByEmailAndSenha(String email, String senha);
}
