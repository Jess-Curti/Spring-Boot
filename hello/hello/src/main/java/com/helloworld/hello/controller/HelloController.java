package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloController {

		@GetMapping("/exercicio1")
		public String hello() {
			return "Atenção aos detalhes, proatividade, responsabilidade pessoal e persistência";
		}
		
		@GetMapping("/exercicio2")
		public String hello2() {
			return "Essa semana espero ter convicção de que estou aprendendo de fato Spring Boot";
		}


}
