package br.com.diego.notafiscal;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class WebApplication {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("postgres");
		dataSource.setPassword("diego");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/contabil");
		dataSource.setDriverClassName("org.postgresql.Driver");
		return dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}