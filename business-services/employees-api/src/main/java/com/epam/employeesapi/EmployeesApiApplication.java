package com.epam.employeesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ComponentScan(basePackages = {"com.epam"})
public class EmployeesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApiApplication.class, args);
	}

}
