package com.wellington.starwars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.starwars.model.Pessoa;
import com.wellington.starwars.service.PessoaService;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;


    @GetMapping
    public ResponseEntity<Iterable<Pessoa>> buscarTodos(){
        return ResponseEntity.ok(pessoaService.buscarTodos());
    }

    @GetMapping("/{id}")
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(pessoaService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<Pessoa> inserir(@RequestBody Pessoa pessoa) {
		pessoaService.inserir(pessoa);
		return ResponseEntity.ok(pessoa);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		pessoaService.atualizar(id, pessoa);
		return ResponseEntity.ok(pessoa);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		pessoaService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
