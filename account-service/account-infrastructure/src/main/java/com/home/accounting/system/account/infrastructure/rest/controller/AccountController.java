package com.home.accounting.system.account.infrastructure.rest.controller;

import com.home.accounting.system.account.application.port.in.AccountService;
import com.home.accounting.system.account.infrastructure.rest.mapper.AccountRestMapper;
import com.home.accounting.system.account.infrastructure.rest.model.CreateAccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountRestMapper accountRestMapper;

    @PostMapping
    public ResponseEntity<UUID> createAccount(@RequestBody CreateAccountRequest request) {
        return new ResponseEntity<>(
                accountService.createAccount(accountRestMapper.createAccountRequestToAccount(request)),
                HttpStatus.CREATED);
    }
}
