package com.home.accounting.system.account.application.port.in;

import com.home.accounting.system.account.application.entity.Account;

import java.util.UUID;

public interface AccountService {

    UUID createAccount(Account account);
}
