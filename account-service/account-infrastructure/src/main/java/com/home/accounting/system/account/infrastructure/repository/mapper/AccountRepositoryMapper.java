package com.home.accounting.system.account.infrastructure.repository.mapper;

import com.home.accounting.system.account.application.entity.Account;
import com.home.accounting.system.account.infrastructure.repository.entity.AccountEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountRepositoryMapper {

    public AccountEntity accountToAccountEntity(Account account) {
        return AccountEntity.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .balance(account.getBalance())
                .build();
    }
}
