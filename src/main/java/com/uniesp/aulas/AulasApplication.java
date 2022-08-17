package com.uniesp.aulas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class AulasApplication {
	@RequestMapping
	public static void main(String[] args) {
		SpringApplication.run(AulasApplication.class, args);

	}

}
