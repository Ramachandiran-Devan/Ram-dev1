package com.ram.lara.project.securityconfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.ram.lara.project.services.TrainerService;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
	@Autowired
	private TrainerService trainerSer;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(trainerSer);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.antMatchers("/trainer").hasRole("TRAINER")
		.antMatchers("/trainer/save").permitAll()
		.antMatchers("/trainer/posts").permitAll()
		.antMatchers("/skill").permitAll()
		.antMatchers("/organization").hasRole("ORGANIZATION")
		.antMatchers("/organization/save").permitAll()
		.antMatchers("/trainer/findtrainer/*").permitAll()
		.antMatchers("/organization/check/{organizationName}/{username}").permitAll()
		.antMatchers("/demo").permitAll()
		.antMatchers("/assignment").permitAll()
		.antMatchers("/trainingpost/save").permitAll()
		.antMatchers("/trainer/check/{username}").permitAll()
		.antMatchers("/organization/get/*").permitAll()
		.antMatchers("/organization/getorg/*").permitAll()
		.anyRequest().authenticated()
		.and().httpBasic()
		.and()
		.formLogin();
	}

}
