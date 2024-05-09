package com.home.accounting.system.account.infrastructure.rest.mapper;

import com.home.accounting.system.account.application.entity.Account;
import com.home.accounting.system.account.infrastructure.rest.model.CreateAccountRequest;
import org.springframework.stereotype.Component;

@Component
public class AccountRestMapper {

    public Account createAccountRequestToAccount(CreateAccountRequest request) {
        return new Account(request.getUserId(), request.getBalance());
    }
}
