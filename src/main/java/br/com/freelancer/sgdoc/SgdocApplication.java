package br.com.freelancer.sgdoc;

//import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SgdocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgdocApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
