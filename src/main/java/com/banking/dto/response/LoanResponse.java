package com.banking.dto.response;

import com.banking.model.LoanStatus;
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
public class LoanResponse {
    private Long loanId;
    private BigDecimal principal;
    private BigDecimal interestRate;
    private Integer termMonths;
    private BigDecimal monthlyPayment;
    private BigDecimal remainingBalance;
    private LoanStatus status;
    private LocalDateTime createdAt;

}
