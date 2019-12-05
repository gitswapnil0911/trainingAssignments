package com.training.entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    private long code;
    private String medicineName;
    private double ratePerUnit;
    private String type;

}
