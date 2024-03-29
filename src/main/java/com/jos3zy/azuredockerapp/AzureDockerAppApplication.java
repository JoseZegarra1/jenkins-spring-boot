package com.jos3zy.azuredockerapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureDockerAppApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(AzureDockerAppApplication.class);

	public static void main(String[] args) {
		logger.info("Starting AzureDockerAppApplication");
		SpringApplication.run(AzureDockerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Running AzureDockerAppApplication run change");
	}
}
