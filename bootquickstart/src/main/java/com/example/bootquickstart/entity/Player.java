package com.example.bootquickstart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPlayer")
public class Player {

    @Id
    private long playerId;
    private String playerName;
    private double iccRanking;

}
