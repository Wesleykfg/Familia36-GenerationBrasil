package br.org.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos()
	{
		return "Hello Família 36 - Meus objetivos para essa semana"
				+ " é aperfeiçoar minhas habilidades com o spring e não surtar!!!";
	}

}
