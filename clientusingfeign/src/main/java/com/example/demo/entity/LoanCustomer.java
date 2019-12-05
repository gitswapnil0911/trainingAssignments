package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanCustomer {

    private long loanId;
    private String loanType;
    private LocalDate openDate;
    private LocalDate cosingDate;
    private double loanAmount;
}
