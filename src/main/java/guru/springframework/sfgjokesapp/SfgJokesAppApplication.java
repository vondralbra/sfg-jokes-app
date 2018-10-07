package guru.springframework.sfgjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "guru.springframework" })
public class SfgJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgJokesAppApplication.class, args);
	}
}
