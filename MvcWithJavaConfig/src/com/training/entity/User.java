package com.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userName;
    private String passWord;
    private String userEmailId;
    private long userContact;




}
