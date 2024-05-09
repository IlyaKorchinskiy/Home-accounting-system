package com.home.accounting.system.account.application.port.out;

import com.home.accounting.system.account.application.entity.Account;

public interface AccountRepository {

    void saveAccount(Account account);
}
