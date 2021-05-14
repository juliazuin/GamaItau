package br.zuin.demo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.zuin.demo.Models.Evento;
import br.zuin.demo.dto.ContagemAlarme;
import br.zuin.demo.repo.EventoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/event")
public class EventoController {

    @Autowired
    private EventoRepo repo;

    @GetMapping("/id/{id}")
    public Evento getEvento(@PathVariable int id) {
        Evento evento = repo.findById(id).orElse(null);
        return evento;
    }

    @PostMapping("/group/data")
    public List<ContagemAlarme> contarData(@RequestBody ObjectNode datas) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate data = LocalDate.parse(datas.get("dtIni").asText(), formato);

        List<ContagemAlarme> lista = repo.countAlarmePorTipo(data);

        return lista;
    }

}
