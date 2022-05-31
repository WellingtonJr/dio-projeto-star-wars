package com.wellington.starwars.service.impl;

import java.util.Optional;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.starwars.model.Personagem;
import com.wellington.starwars.model.PersonagemRepository;
import com.wellington.starwars.model.Pessoa;
import com.wellington.starwars.model.PessoaRepository;
import com.wellington.starwars.service.PersonagemService;
import com.wellington.starwars.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    PersonagemRepository personagemRepository;

    @Autowired
    PersonagemService personagemService;

    @Override
    public void atualizar(Long id, Pessoa pessoa) {
        Optional<Pessoa> pessoaBd = pessoaRepository.findById(id);
        if (pessoaBd.isPresent()) {
            salvarPessoaComPersonagem(pessoa);
        }
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).get();
    }

    @Override
    public Iterable<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

    @Override
    public void inserir(Pessoa pessoa) {
        salvarPessoaComPersonagem(pessoa);
    }

    private void salvarPessoaComPersonagem(Pessoa pessoa) {
        Long numeroAleatorio = RandomUtils.nextLong(1, 80);
        // Long idPersonagem = pessoa.getPersonagem().getId();
        Personagem personagem = personagemRepository.findById(numeroAleatorio).orElseGet(() -> {
            Personagem p = personagemService.consultaPersonagem(numeroAleatorio);
            p.setId(numeroAleatorio);
            personagemRepository.save(p);
            return p;
        });
        pessoa.setPersonagem(personagem);
        pessoaRepository.save(pessoa);

    }

}
