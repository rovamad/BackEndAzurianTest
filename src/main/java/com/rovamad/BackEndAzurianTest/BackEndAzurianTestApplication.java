package com.rovamad.BackEndAzurianTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.rovamad.BackEndAzurianTest")
public class BackEndAzurianTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndAzurianTestApplication.class, args);
	}

}
