package co.com.bancolombia.ms_localiza.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"co.com.bancolombia.ms_localiza"})
@SpringBootApplication
public class MsLocalizaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsLocalizaApplication.class, args);
	}
}
