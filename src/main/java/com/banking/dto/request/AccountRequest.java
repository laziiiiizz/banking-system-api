package com.banking.dto.request;

import com.banking.model.AccountType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class AccountRequest {
    @NotNull(message = "Customer type is required")
    private AccountType type;

    @NotNull(message = "Customer ID is required")
    private Long customerId;

}
