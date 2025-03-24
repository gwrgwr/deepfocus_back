package com.mullen.deepfocus.config;

import com.mullen.deepfocus.security.FirebaseAuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SpringConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                .cors(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/v3/api-docs", "swagger-ui/**").permitAll()
                        .anyRequest().permitAll())
                .addFilterBefore(new FirebaseAuthFilter(), UsernamePasswordAuthenticationFilter.class)
                .formLogin(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer.disable())
                .httpBasic(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer.disable())
                .build();
    }
}
