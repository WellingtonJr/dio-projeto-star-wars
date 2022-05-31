package com.wellington.starwars.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem,Long>{
    Personagem findByName(String name);
}
