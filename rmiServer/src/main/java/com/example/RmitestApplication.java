package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

@SpringBootApplication
public class RmitestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmitestApplication.class, args);

	}

	@Bean
	public RmiServiceExporter rmiServiceExporter(TestService testService) {
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setService(testService);
		exporter.setServiceName("TestService");
		exporter.setServiceInterface(TestService.class);
		return exporter;

	}
}
