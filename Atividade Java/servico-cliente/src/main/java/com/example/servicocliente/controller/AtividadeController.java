package com.example.servicocliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicocliente.model.Atividade;
import com.example.servicocliente.repository.AtividadeRepository;



@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@PostMapping()
	public ResponseEntity<Atividade> post(@RequestBody Atividade atividade) {
		Atividade result = this.atividadeRepository.save(atividade);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
}
