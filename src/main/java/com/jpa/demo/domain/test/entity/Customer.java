package com.jpa.demo.domain.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(name = "sex",columnDefinition = "varchar(32) NOT NULL comment '是否有效：true：是；false：否'")
    private Boolean sex;


}
