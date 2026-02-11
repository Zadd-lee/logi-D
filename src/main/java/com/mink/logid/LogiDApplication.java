package com.mink.logid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LogiDApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogiDApplication.class, args);
	}

}
