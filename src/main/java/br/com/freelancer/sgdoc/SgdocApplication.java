package br.com.freelancer.sgdoc;

//import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@EntityScan("br.com.freelancer.model")
@ComponentScan("br.com.freelancer.sgdoc.*")
public class SgdocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgdocApplication.class, args);
	}
	
	
	/*
	 * @Bean public DataSource dataSource(Environment environment) {
	 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 * dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	 * dataSource.setUrl("jdbc:mysql://localhost:3306/sgdoc");
	 * dataSource.setUsername("root"); dataSource.setPassword("root"); return
	 * dataSource; }
	 */

}
