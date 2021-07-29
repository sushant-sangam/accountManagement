package com.cgi.account.transaction.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CgiAccountTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgiAccountTransactionApplication.class, args);
	}

}
