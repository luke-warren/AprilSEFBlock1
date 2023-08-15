package org.bank;

public class ATM {
    public String location;
    public String managedBy;

    public ATM(String location, String managedBy) {
        this.location = location;
        this.managedBy = managedBy;
    }

    public Double withdraw(Account account, Double amount){
      return 0.0;
    }

    public Double deposit(Account account, Double amount){
        return 0.0;
    }

    public Double checkBalance(Account account){
        return 0.0;

    }
}
