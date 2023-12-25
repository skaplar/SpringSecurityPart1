package com.sebastijankaplar.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ExampleWebSecurityConfigUsingDecoder {

    @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri:}")
    private String jwkSetUri;

    /**
     *  Example using jwtDecoder
    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
    }

    @Bean
    public SecurityFilterChain internalFilterChain(HttpSecurity http) throws Exception {
        http
                .securityMatcher("/api/internal/**")
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/api/internal/**")
                        .authenticated()
                        .anyRequest().permitAll()
                ).csrf(CsrfConfigurer::disable)
                .sessionManagement(sessionManagement -> sessionManagement
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(oauth2ResourceServer ->
                                              oauth2ResourceServer
                                                      .jwt(jwt -> jwt.decoder(jwtDecoder())));

        return http.build();
    }
     */

}
