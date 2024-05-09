package com.home.accounting.system.account.application.entity;

import com.home.accounting.system.account.application.exception.BusinessValidationException;

import java.math.BigDecimal;
import java.util.UUID;

public class Account extends BaseEntity<UUID> {

    private final UUID userId;
    private BigDecimal balance;

    public Account(UUID userId, BigDecimal balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public void validateAndInitialize() {
        if (userId == null || balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new BusinessValidationException("Account not valid.");
        }
        this.setId(UUID.randomUUID());
    }

    public void increaseBalance(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void reduceBalance(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public UUID getUserId() {
        return userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
