package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static Logger logger = LogManager.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ApplicationContext context) {

		return args -> {
			logger.info(" --------------- Inspecting The Beans -------------------------");

			String[] beans = context.getBeanDefinitionNames();

			for (String bean : beans) {
				logger.info(bean);
			}

		};

	}

}
