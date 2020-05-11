package com.banque.security;





import org.springframework.context.annotation.Configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

import org.springframework.security.crypto.password.PasswordEncoder;







@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	//@Autowired
	//private DataSource datasource;
	
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	// TODO Auto-generated method stub
    	//les utilistateurs qui ont permission
    	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("1234")).roles("ADMIN","USER");
    	auth.inMemoryAuthentication().withUser("user").password(encoder.encode("1234")).roles("USER");
   
    /**	auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("select username as principal,password as credentials, active from users where username=? ")
		.authoritiesByUsernameQuery("select username as principal, role as role from users_roles where username=?")
		.passwordEncoder(new Md4PasswordEncoder())
		.rolePrefix("ROLE_");*/
    }
	
	@Override
	// définir les stratégies de sécutités
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		http.formLogin().loginPage("/login");
		http.authorizeRequests().antMatchers("/operations","/consulterCompte").hasRole("USER");
		http.authorizeRequests().antMatchers("/saveOperation").hasRole("ADMIN");
		http.exceptionHandling().accessDeniedPage("/403");
	}
	
}
