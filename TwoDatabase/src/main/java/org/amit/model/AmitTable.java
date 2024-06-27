package org.amit.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "amitDB")
public class AmitTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id ;
    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "age",nullable = false)
    String age;

}
