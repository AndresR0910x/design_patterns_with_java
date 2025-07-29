package com.duckboss.simuduck;

import org.springframework.boot.SpringApplication;

public class TestSimUDuckApplication {

	public static void main(String[] args) {
		SpringApplication.from(SimUDuckApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
