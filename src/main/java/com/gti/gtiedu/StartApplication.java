package com.gti.gtiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		System.out.print("项目启动");
		SpringApplication.run(StartApplication.class, args);
	}
}
