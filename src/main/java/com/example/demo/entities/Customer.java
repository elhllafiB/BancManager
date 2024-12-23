package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity

@Data @NoArgsConstructor
@AllArgsConstructor
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private  String name;
    private  String email;
    //c est comme on dit a jpa , il faut savoir que dans bankAccount il y a un attribue de nom customer(le cle etranger est dans l autre classe
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
