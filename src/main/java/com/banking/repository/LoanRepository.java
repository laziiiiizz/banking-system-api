package com.banking.repository;

import com.banking.model.Loan;
import com.banking.model.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByCustomerId(Long customerId);

    List<Loan> findByCustomerIdAndStatus(Long customerId, LoanStatus status);

    List<Loan> findByStatus(LoanStatus status);

}
