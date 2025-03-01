package no.hvl.dat108.oblig4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Oblig4Application {

	public static void main(String[] args) {
		SpringApplication.run(Oblig4Application.class, args);
	}

}
