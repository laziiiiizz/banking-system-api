package com.banking.dto.response;

import com.banking.model.AccountStatus;
import com.banking.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponse {
    private Long accountId;
    private String accountNumber;
    private AccountType type;
    private BigDecimal balance;
    private BigDecimal interestRate;
    private AccountStatus status;
    private LocalDateTime createdAt;

}
