package uk.gov.ons.lambdatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LambdatestApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(LambdatestApplication.class, args);
	}
}
