package com.wellington.starwars.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wellington.starwars.model.Personagem;

@FeignClient(name = "swapi", url="https://swapi.dev/api/")
public interface PersonagemService {
    
    @GetMapping("/people/{id}/")
    Personagem consultaPersonagem(@PathVariable("id") Long id);

}
