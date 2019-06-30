package com.junaid.sample.springbootdocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.junaid.sample"})
public class SpringbootDockerApplication {
	private static Logger logger=LoggerFactory.getLogger(SpringbootDockerApplication.class);
	
	public static void main(String[] args) {		
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
