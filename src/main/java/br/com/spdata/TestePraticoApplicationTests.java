package br.com.spdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.spdata"})
public class TestePraticoApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(TestePraticoApplication.class, args);
	}

}
