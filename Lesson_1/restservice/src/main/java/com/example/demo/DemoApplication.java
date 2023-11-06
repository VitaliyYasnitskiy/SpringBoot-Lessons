/*
Решаем задание SpringBoot
https://spring.io/guides/gs/rest-service/
*/

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//тот main() метод использует метод Spring Boot SpringApplication.run()для запуска приложения
}
