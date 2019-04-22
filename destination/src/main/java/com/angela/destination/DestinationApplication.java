package com.angela.destination;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.angela.destination.dao")
public class DestinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinationApplication.class, args);
	}

}
