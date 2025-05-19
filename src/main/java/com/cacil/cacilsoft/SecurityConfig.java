package com.cacil.cacilsoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig {

	@Bean
	 InMemoryUserDetailsManager userDetailsService() {
	    UserDetails user = User
	        .withUsername("admin")
	        .password("{noop}1234") // {noop} indica que no hay encriptación (solo para pruebas)
	        .roles("USER")
	        .build();

	    return new InMemoryUserDetailsManager(user);
	}
}
