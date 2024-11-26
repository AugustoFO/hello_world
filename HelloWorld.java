package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade01")

public class HelloWorld {
	
	@GetMapping("hello-world")
	public String helloWorld(){
		return "Hello World!";
	}
	
	@GetMapping("bsm-generation")
	public String bsmGeneration(){
		return "Trabalho em equipe, Comunicação assertiva, Resiliência, Proatividade e outras trabalhadas.";
	}
	
	@GetMapping("lista-objetivos")
	public String listaObjetivos(){
		return "Revisar POO, Revisar Optional, Revisar Stream e organizar o bendito do monitor (já que sem ele eu não faço nada que planejei rs).";
	}
}
