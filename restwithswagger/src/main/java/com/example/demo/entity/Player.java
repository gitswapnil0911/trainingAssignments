package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPlayer")
public class Player {

    @Id
    private long playerId;

    @Length(max = 10, min = 2,message = "Player name should be minimum 2 characters")
    private String playerName;

    @DecimalMax("5.0")
    @DecimalMin("1.0")
    private BigDecimal iccRanking;

}
