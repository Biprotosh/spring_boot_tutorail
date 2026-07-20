package com.springboottutorial.crud_spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class CrudSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootDemoApplication.class, args);
		System.out.println("Hello world");
	}

}


/*
	1. Listen to endpoints (controller layer is responsible, like: /api/students)
    2. Business logic (service layer is responsible, like: how to store or before store which actions to perform)
	3. Interact with DB (repository layer is responsible, like: interact with db to store data)
	4. Response back to client (DB -> repo -> service -> controller -> client)

	The above architecture is known as controller-service-repository architecture
*/