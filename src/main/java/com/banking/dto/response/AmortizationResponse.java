package com.banking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmortizationResponse {
    private Integer month;
    private BigDecimal payment;
    private BigDecimal principalPaid;
    private BigDecimal interestPaid;
    private BigDecimal remainingBalance;
}
