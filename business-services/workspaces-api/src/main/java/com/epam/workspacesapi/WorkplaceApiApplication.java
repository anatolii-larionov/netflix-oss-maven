package com.epam.workspacesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.epam.commons"})
@EnableJpaRepositories(basePackages = {"com.epam.*"})
@EntityScan("com.epam.commons.*")
//@ComponentScan(basePackages = {"com.epam.workspacesapi.repository"})
public class WorkplaceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkplaceApiApplication.class, args);
	}

}
