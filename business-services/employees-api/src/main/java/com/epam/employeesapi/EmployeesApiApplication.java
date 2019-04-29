package com.epam.employeesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.epam.commons"})
@EnableEurekaClient
@EnableJpaRepositories(basePackages = {"com.epam.commons.*", "com.epam.*"})
@EntityScan("com.epam.commons.*")
//@ComponentScan(basePackages = {"com.epam"})
public class EmployeesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApiApplication.class, args);
	}

}
