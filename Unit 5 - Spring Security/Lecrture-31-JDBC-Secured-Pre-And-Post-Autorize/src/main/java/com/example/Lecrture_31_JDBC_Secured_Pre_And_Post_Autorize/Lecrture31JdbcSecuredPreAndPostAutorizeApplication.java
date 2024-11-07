package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Lecrture31JdbcSecuredPreAndPostAutorizeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lecrture31JdbcSecuredPreAndPostAutorizeApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

}

