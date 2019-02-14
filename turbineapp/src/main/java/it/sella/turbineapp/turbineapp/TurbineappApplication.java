package it.sella.turbineapp.turbineapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class TurbineappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineappApplication.class, args);
	}

}

