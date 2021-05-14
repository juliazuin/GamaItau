package br.zuin.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.zuin.demo.Models.Equipamento;

public interface EquipamentoRepo extends CrudRepository<Equipamento, Integer>{
    
}
