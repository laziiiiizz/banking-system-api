package com.banking.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class LoanRequest {
    @NotNull(message = "Amount is required")
    @Positive(message = "Loan amount must be greater than zero")
    private BigDecimal principal;

    @NotNull(message = "Interest rate is required")
    @Positive(message = "interest rate must be greater than zero")
    private BigDecimal interestRate;

    @NotNull(message = "Term is required")
    @Positive(message = "Term must be greater than zero")
    private Integer termMonths;


}
