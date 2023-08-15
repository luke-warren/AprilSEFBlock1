package org.bank;

import java.util.ArrayList;

public abstract class Account {
    public String number;
    public Double balance;

    public ArrayList<String> transactions;

    public Account(String number, Double balance) {
        this.number = number;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public abstract Double deposit(Double amount);
    public abstract Double withdraw(Double amount);
}
