package com.home.accounting.system.account.infrastructure.repository.adapter;

import com.home.accounting.system.account.application.entity.Account;
import com.home.accounting.system.account.application.port.out.AccountRepository;
import com.home.accounting.system.account.infrastructure.repository.jparepository.AccountJpaRepository;
import com.home.accounting.system.account.infrastructure.repository.mapper.AccountRepositoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;
    private final AccountRepositoryMapper accountRepositoryMapper;

    @Override
    public void saveAccount(Account account) {
        accountJpaRepository.save(accountRepositoryMapper.accountToAccountEntity(account));
    }
}
