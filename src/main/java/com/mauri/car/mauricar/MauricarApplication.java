package com.mauri.car.mauricar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"src/main/java.*"})
public class MauricarApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MauricarApplication.class, args);
		
		
	}
}