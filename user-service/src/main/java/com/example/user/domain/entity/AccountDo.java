package com.example.user.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountDo {
    private Long id;
    private BigDecimal amount;
    private BigDecimal frozenAmount;
}
