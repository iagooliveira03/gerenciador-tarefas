package com.gerenciador.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

	@GetMapping("/teste-api")
	private String teste() {
		return "Sucesso";
	}

	@GetMapping("teste-api-bemvindo")
	public String testeBemvindo(@RequestParam(name = "nome") String nome) {
		return "Olá " + nome + ", Seja muito bem vindo! ";
	}
}
