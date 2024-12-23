package com.example.demo.repositories;


import com.example.demo.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositoriy extends JpaRepository<BankAccount, Long> {
}
