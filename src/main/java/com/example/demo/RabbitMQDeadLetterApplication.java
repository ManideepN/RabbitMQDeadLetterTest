package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQDeadLetterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQDeadLetterApplication.class, args);
	}
}
