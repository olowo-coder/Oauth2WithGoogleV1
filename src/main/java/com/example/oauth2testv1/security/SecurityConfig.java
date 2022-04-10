package com.example.oauth2testv1.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login").authenticated()
                .and()
                .oauth2Login()
                .defaultSuccessUrl("/loginSuccess", true)
                .failureUrl("/loginFail").and().authorizeRequests()
                .antMatchers("/access").permitAll()
                .anyRequest().authenticated();

    }
}
