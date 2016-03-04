package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
@ComponentScan(basePackageClasses = RMICaller.class)
@SpringBootApplication
public class RmitestApplication {





	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(RmitestApplication.class, args);
		RMICaller myBean = app.getBean(RMICaller.class);//get the bean by type
		myBean.get();
	}

	@Bean
	public RmiProxyFactoryBean proxyFactoryBean() {
		RmiProxyFactoryBean importer = new RmiProxyFactoryBean();
		importer.setServiceUrl("rmi://localhost/TestService");
		importer.setServiceInterface(TestService.class);
		return importer;
	}

}
