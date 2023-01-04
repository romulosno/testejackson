package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {

	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static void main(String[] args) {
		MeuVO meuVo = new MeuVO();
		SpringApplication.run(DemoApplication.class, args);
	}



	

}
