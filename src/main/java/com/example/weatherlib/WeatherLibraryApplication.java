package com.example.weatherlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeatherLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherLibraryApplication.class, args);
	}

}
