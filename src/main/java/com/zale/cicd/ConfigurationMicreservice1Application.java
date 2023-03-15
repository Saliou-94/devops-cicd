package com.zale.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationMicreservice1Application {

	@GetM
	public String welcome(){
			return "Bienvenue en master Genie Logiciel "; 
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationMicreservice1Application.class, args);

		
	}

}
