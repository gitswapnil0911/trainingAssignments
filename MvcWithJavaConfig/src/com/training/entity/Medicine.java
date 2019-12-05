package com.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    private long code;
    private String medicineName;
    private double ratePerUnit;
    private String type;

}
