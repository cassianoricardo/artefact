//package br.com.freelancer.sgdoc.config;
//
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//
//
//@EnableWebMvc
//@Configuration
//public class WebConfig implements WebMvcConfigurer{
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//	    LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//	    localeChangeInterceptor.setParamName("lang");
//	    registry.addInterceptor(localeChangeInterceptor);
//	}
//	
//	@Bean
//	public LocaleResolver localeResolver() {
//	    SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
//	    return sessionLocaleResolver;
//	}
//	
//	
//	@Bean
//	public MessageSource messageSource() {
//	    ReloadableResourceBundleMessageSource messageSource = 
//	      new ReloadableResourceBundleMessageSource();
//	    messageSource.setBasename("classpath:messages");
//	    messageSource.setUseCodeAsDefaultMessage(true);
//	    messageSource.setDefaultEncoding("UTF-8");
//	    messageSource.setCacheSeconds(0);
//	    return messageSource;
//	}
//
//}
