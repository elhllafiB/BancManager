package com.example.demo.repositories;


import com.example.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustemerRepository  extends JpaRepository<Customer , Long> {



}
