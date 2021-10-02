package com.bank.citi.account.citibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bank.citi.account.citibank")
public class CitiBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiBankApplication.class, args);
	}

}
