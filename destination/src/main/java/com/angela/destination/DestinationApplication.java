package com.angela.destination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class DestinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinationApplication.class, args);
	}

}
