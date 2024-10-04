package com.example.lab04.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "savings_account")
public class SavingsAccount extends Account {
    private double APY;
}
