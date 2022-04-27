package com.syntax.class33;

import javax.jws.Oneway;

public class Account {
    double balance;
    public void setBalance(double balance) throws Exception {
        throw new Exception("can't set negative balance");
    }
}

class ThrowDemo{
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        account.setBalance(-15);
    }
}