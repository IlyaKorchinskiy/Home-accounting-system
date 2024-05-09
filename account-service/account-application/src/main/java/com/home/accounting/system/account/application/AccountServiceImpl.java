package com.home.accounting.system.account.application;

import com.home.accounting.system.account.application.annotation.UseCase;
import com.home.accounting.system.account.application.annotation.UseCaseService;
import com.home.accounting.system.account.application.entity.Account;
import com.home.accounting.system.account.application.port.in.AccountService;
import com.home.accounting.system.account.application.port.out.AccountRepository;

import java.util.UUID;

@UseCaseService
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    @UseCase
    public UUID createAccount(Account account) {
        account.validateAndInitialize();
        accountRepository.saveAccount(account);
        return account.getId();
    }
}
