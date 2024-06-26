package com.home.accounting.system.account.application.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Expense extends BaseEntity<UUID> {

    private LocalDate date;
    private BigDecimal amount;
    private UUID expenseCategoryId;
}
