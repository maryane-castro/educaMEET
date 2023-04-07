package com.educaagenda.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    // TODO verificar permições dos usuarios
    /*
     * // ROLE_ADMIN,
     * // ROLE_ORGANIZADOR,
     * // ROLE_ACADEMICO
     * //
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeHttpRequests()
                .requestMatchers(HttpMethod.POST, "/**").permitAll()
                .requestMatchers("/my/**").authenticated()
                .anyRequest().hasAnyRole("ADMIN", "ORGANIZADOR")
                .requestMatchers(HttpMethod.DELETE, "/**").hasRole("ADMIN");
                //.anyRequest().authenticated();
        http.csrf().disable();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
