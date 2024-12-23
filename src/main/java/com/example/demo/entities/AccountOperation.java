package com.example.demo.entities;

import com.example.demo.enums.OperationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {


    @Id
    private Long id ;
    private Date peration ;
    private double amount ;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount ;


    public void setId(Long id) {
        this.id = id;
    }

    public void setPeration(Date peration) {
        this.peration = peration;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
