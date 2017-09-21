package org.o7planning.springmvchibernatesecurity.config;

import org.o7planning.springmvchibernatesecurity.authentication.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.annotation.Transactional;
 
@Configuration
@EnableWebSecurity
@Transactional
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
    
    @Autowired(required=true)
    private MyUserDetailsService myUserDetailsService;
 
    @Autowired(required=true)
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	System.out.println("configureGlobal()=====WebSecurityConfig");
        // Users in memory.
 
        auth.inMemoryAuthentication().withUser("user1").password("12345").roles("USER");
        auth.inMemoryAuthentication().withUser("admin1").password("12345").roles("USER, ADMIN");
 
        // For User in database.
        auth.userDetailsService(myUserDetailsService);
 
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
	System.out.println("configure()=====WebSecurityConfig");
        http.csrf().disable();
 
        // The pages does not require login
        http.authorizeRequests().antMatchers("/", "/login").permitAll();
 
        // /userInfo page requires login as USER or ADMIN.
        // If no login, it will redirect to /login page.
        http.authorizeRequests().antMatchers("/userInfo").access("hasRole('ROLE_USER')");
 
  
        // Config for Login Form
        http.authorizeRequests().antMatchers("/resources/**", "/css/**", "/js/**", "/images/**","/json/**").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()//
                // Submit URL of login page.
                .loginProcessingUrl("/j_spring_security_check") // Submit URL
                .loginPage("/login")//
                .defaultSuccessUrl("/userInfo")//
                .failureUrl("/login?error=true")//
                .usernameParameter("username")//
                .passwordParameter("password")
                // Config for Logout Page
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
 
    }
    
  
}
