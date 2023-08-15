package org.bank;

import java.util.Date;

public class Customer {
    public String name;
    public String address;
    public Date dob;

    public Long cardNumber;

    public int pin;

    public Customer(String name, String address, Date dob, Long cardNumber, int pin) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public boolean verifyPassword(String password){
        return false;
    }
}
