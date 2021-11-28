package com.locallyhosted.basecase.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication

public class BaseSpringApplication {
	public static void main(String[] args) throws UnknownHostException {
		Environment environment = SpringApplication.run(BaseSpringApplication.class, args).getEnvironment();

		// Print application configuration
        System.out.println("Local URL: http://localhost:" + environment.getProperty("server.port") + "/");
        System.out.println("External URL: " + InetAddress.getLocalHost().getHostAddress());
        System.out.println("Active Database: " + environment.getProperty("spring.datasource.url"));

	}

}
