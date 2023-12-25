package com.sebastijankaplar.demo.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ExampleWebSecurityConfigUsingConverter {

    @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri:}")
    private String jwkSetUri;

    /**
     * Example using JwtDecoder and authentication converter
     *
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> auth
                        .anyRequest()
                        .hasAnyAuthority("ADMIN")
                ).csrf(CsrfConfigurer::disable)
                .sessionManagement(sessionManagement -> sessionManagement
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(oauth2ResourceServer ->
                                              oauth2ResourceServer
                                                      .jwt(jwt -> jwt.decoder(jwtDecoder())
                                                              .jwtAuthenticationConverter(getJwtAuthenticationConverter()))
                );

        return http.build();
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
    }

    private JwtAuthenticationConverter getJwtAuthenticationConverter() {
        JwtAuthenticationConverter conv = new JwtAuthenticationConverter();

        conv.setJwtGrantedAuthoritiesConverter(jwt -> {

            List<String> cognitoGroups = (List<String>) jwt.getClaims().get("cognito:groups");
            if (cognitoGroups == null) {
                return new ArrayList<>();
            }

            return cognitoGroups.stream()
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        });
        return conv;
    }

     */
}
