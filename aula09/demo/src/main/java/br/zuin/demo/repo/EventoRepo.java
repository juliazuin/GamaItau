package br.zuin.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.zuin.demo.Models.Evento;
import br.zuin.demo.dto.ContagemAlarme;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findByDataEvtBetween(LocalDate ini, LocalDate fim);

    @Query("Select new br.zuin.demo.dto.ContagemAlarme(e.alarme.nome, Count(e.alarme.nome)) From Evento as e where dataEvt = ?1 group by e.alarme.nome")
    public List<ContagemAlarme> countAlarmePorTipo(LocalDate data);
}
