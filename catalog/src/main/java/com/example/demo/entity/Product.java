package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JPITEM2")
public class Product {

    @Id
    private int productId;
    private String productName;
    private double ratePerUnit;
    private String imageRef;

/*    @ManyToOne
    private Catalog catalog;*/
}
