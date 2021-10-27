package br.org.generation.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade")
public class HabilidadesController {
	
	@GetMapping
	public String habilidades()
	{
		return "Hello Família 36!!!"
				+ "\nAs habilidades utilizadas foram: Persistencia e Atenção aos Detahes!!!"
				+ "\nA mentalidade foi a de Crescimento, para o desenvolvimento continuo!!!";
	}
}

