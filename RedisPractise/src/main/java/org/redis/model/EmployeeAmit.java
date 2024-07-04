package org.redis.model;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_AMIT")
public class EmployeeAmit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id ;
    @Column(name = "name",nullable = false)
    String name ;
    @Column(name = "password",nullable = false)
    String password ;
    @Column(name = "amount",nullable = false)
    String amount ;

}
