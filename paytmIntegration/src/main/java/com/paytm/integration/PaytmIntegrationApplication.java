package com.paytm.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controllers")
public class PaytmIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmIntegrationApplication.class, args);
	}

}
