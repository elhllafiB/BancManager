package com.example.demo.entities;

import com.example.demo.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )

@DiscriminatorColumn(name ="Type" , length = 4 )
public class BankAccount {
    @Id
    private String id;

    private double balance;
    private Date createdAt;
    // pour stocker dans la base de donne format spring n est pas 0,1,2
    @Enumerated(EnumType.STRING)
    private AccountStatus status ;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "bankAccount")
    private List<AccountOperation> accountOperationList;







    public void setId(String id) {
        this.id = id;
    }

    public void setAccountOperationList(List<AccountOperation> accountOperationList) {
        this.accountOperationList = accountOperationList;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
