package com.example.lab04.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "checking_account")
public class CheckingAccount extends Account {
    private double overdraftLimit;
}
