package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JPCATALOG2")
public class Catalog {

    @Id
    private int id;
    private String catalogName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "catalogRef",nullable = false)
    private Set<Product> productList;

}
