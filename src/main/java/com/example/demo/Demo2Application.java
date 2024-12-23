package com.example.demo;

import com.example.demo.entities.CurrentAccount;
import com.example.demo.entities.Customer;
import com.example.demo.entities.SavingAccount;
import com.example.demo.enums.AccountStatus;
import com.example.demo.repositories.AccountOperationRepository;
import com.example.demo.repositories.BankAccountRepositoriy;
import com.example.demo.repositories.CustemerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;


@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }


    @Bean
    CommandLineRunner start(CustemerRepository custemerRepository ,
                            BankAccountRepositoriy bankAccountRepositoriy,
                            AccountOperationRepository accountOperationRepository) {


        return args -> {

            Stream.of("Hassan", "Yassine", "Aicha").forEach(name ->{

                Customer customer = new Customer();
                customer.setName(name);
                customer.setEmail(name+"@gmail.com");
                custemerRepository.save( customer);
            });

            custemerRepository.findAll().forEach(cust->{

                CurrentAccount currentAccount = new CurrentAccount();
                currentAccount.setId(UUID.randomUUID().toString());
                currentAccount.setBalance(Math.random()*100);
                currentAccount.setCreatedAt(new Date());
                currentAccount.setStatus(AccountStatus.Created);
                currentAccount.setCustomer(cust);
                currentAccount.setOverDraft(9000);
                bankAccountRepositoriy.save(currentAccount);

                SavingAccount savingAccount = new SavingAccount();
                savingAccount.setId(UUID.randomUUID().toString());
                savingAccount.setBalance(Math.random()*100);
                savingAccount.setCreatedAt(new Date());
                savingAccount.setStatus(AccountStatus.Created);
                savingAccount.setCustomer(cust);
                savingAccount.setInterstRate(5.5);
                bankAccountRepositoriy.save(savingAccount);



            });







        };


    }
}
