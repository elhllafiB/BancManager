package com.example.demo.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount {

    private double interstRate;


    public void setInterstRate(double interstRate) {
        this.interstRate = interstRate;
    }
}
