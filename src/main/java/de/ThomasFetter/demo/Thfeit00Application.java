package de.ThomasFetter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@SpringBootApplication
public class Thfeit00Application {

	public static void main(String[] args) {
		SpringApplication.run(Thfeit00Application.class, args);
	}

//	@Bean // spass für die Datenbank
//	@Primary
//	public DataSource getPrimaryDatasource(){
//		DataSource dataSource = DataSourceBuilder.create()
//				.driverClassName("com.mysql.cj.jdbc.Driver")
//				.url("jdbc:mysql//localhost:3306/db")
//				.username("admin")
//				.password("123")
//
//				.build();
//
//		return dataSource;
//	}

}
