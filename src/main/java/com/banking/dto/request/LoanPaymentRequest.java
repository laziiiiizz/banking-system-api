package com.banking.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class LoanPaymentRequest {
    @NotNull(message = "Amount is required")
    @Positive(message = "Payment amount must be greater than zero")
    private BigDecimal amount;

}
