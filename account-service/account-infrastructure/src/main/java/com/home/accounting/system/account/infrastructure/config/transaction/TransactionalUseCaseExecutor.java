package com.home.accounting.system.account.infrastructure.config.transaction;

import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;

public class TransactionalUseCaseExecutor {

    @Transactional
    <T> T executeInWriteTransaction(Supplier<T> execution) {
        return execution.get();
    }

    @Transactional(readOnly = true)
    <T> T executeInReadTransaction(Supplier<T> execution) {
        return execution.get();
    }
}
