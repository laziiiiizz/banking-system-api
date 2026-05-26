package com.banking.dto.response;

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
public class LoanPaymentResponse {
    private Long paymentId;
    private Long loanId;
    private BigDecimal amount;
    private LocalDateTime paidAt;

}
