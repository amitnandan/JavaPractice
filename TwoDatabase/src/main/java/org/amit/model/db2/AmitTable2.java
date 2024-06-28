package org.amit.model.db2;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "amitDB")
public class AmitTable2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id ;
    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "age",nullable = false)
    String age;

}
