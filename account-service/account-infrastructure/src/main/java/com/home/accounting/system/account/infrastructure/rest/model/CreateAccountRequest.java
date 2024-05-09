package com.home.accounting.system.account.infrastructure.rest.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
public class CreateAccountRequest {
    private UUID userId;
    private BigDecimal balance;
}
