package com.home.accounting.system.account.infrastructure;

import com.home.accounting.system.account.application.annotation.UseCaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "com.home.accounting.system.account",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = UseCaseService.class))
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
}
