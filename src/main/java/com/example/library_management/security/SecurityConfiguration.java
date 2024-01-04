package com.example.library_management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {


        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/students","/publishers").hasRole("ADMIN")
                        .requestMatchers("/authors","/books","/loans").hasRole("USER")
                        .anyRequest().authenticated())
                .formLogin(s ->s.loginProcessingUrl("/login").successForwardUrl("/api/**")
//                        defaultSuccessUrl("/students", true)
                        .failureUrl("/login-error").permitAll());


        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var user = new InMemoryUserDetailsManager();

        UserDetails u1 = User.withUsername("Usopp")
                .password(passwordEncoder().encode("1234"))
                .roles("ADMIN").build();

        UserDetails u2 = User.withUsername("Zoro")
                .password(passwordEncoder().encode("1234"))
                .roles("USER").build();

        user.createUser(u1);
        user.createUser(u2);
        return user;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}