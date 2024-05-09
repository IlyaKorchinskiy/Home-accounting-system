package com.home.accounting.system.account.infrastructure.repository.jparepository;

import com.home.accounting.system.account.infrastructure.repository.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountJpaRepository extends JpaRepository<AccountEntity, UUID> {}
