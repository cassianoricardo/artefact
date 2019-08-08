package br.com.groupid.artefact.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
				.anyRequest() //Para toda requisição o usuario esteja autenticado
				.authenticated()
			.and()
			.formLogin()
			.loginPage("/view/login")
			.permitAll();
	}
}
