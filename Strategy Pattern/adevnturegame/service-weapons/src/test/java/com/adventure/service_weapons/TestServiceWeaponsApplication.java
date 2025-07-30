package com.adventure.service_weapons;

import org.springframework.boot.SpringApplication;

public class TestServiceWeaponsApplication {

	public static void main(String[] args) {
		SpringApplication.from(ServiceWeaponsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
