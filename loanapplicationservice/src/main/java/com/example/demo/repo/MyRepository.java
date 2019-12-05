package com.example.demo.repo;

import com.example.demo.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository  extends JpaRepository<LoanApplication, Long> {

    public LoanApplication findByLoanType(String loanType);
    public LoanApplication findByLoanStatus(String loanStatus);

}
