package com.example.Spring_security_basics.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {

        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults());

        return http.build();
    }

}
