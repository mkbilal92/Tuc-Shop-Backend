package com.example.tucshopbackend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    private Long id;


    private Long amount;


}
