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
@ComponentScan("br.com.freelancer.*")
public class SgdocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgdocApplication.class, args);
	}
	
	
	public void cadastraUsuarios() {
		
	}

}
