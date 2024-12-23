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
@DiscriminatorValue("CURR")
// CURR c est la valeur qu on vat affecter dans la colonne type qu on cree un compte de type CurrentAccount
public class CurrentAccount extends BankAccount{
    private double overDraft;


    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}
