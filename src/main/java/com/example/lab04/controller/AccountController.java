package com.example.lab04.controller;

import com.example.lab04.model.Account;
import com.example.lab04.model.CheckingAccount;
import com.example.lab04.model.SavingsAccount;
import com.example.lab04.repository.AccountRepository;
import com.example.lab04.repository.CheckingAccountRepository;
import com.example.lab04.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private SavingsAccountRepository savingsAccountRepository;

    @Autowired
    private CheckingAccountRepository checkingAccountRepository;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping("/savings")
    public SavingsAccount createSavingsAccount(@RequestBody SavingsAccount savingsAccount) {
        return savingsAccountRepository.save(savingsAccount);
    }

    @PostMapping("/checking")
    public CheckingAccount createCheckingAccount(@RequestBody CheckingAccount checkingAccount) {
        return checkingAccountRepository.save(checkingAccount);
    }
}
