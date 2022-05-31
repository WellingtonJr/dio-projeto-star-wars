package com.wellington.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConselhoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConselhoprojectApplication.class, args);
	}

}
