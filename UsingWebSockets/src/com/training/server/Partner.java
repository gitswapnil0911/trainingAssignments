package com.training.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Partner {

    private long partnerCode;
    private String partnerName;
    private long mobileNumber;


}
