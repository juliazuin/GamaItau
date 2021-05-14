package br.zuin.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.zuin.demo.Models.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer> {
    
}
