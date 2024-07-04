package com.example.publishapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PublishapiApplication {

	public static void main(String[] args) {
		// this is v1
		// one more added
		// oooonneee moreeee

		// one
		SpringApplication.run(PublishapiApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
