package com.jy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LoginJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginJavaApplication.class, args);
    }

}
