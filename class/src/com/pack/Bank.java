package com.pack;

public class Bank {



    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount made " + this.balance);
    }

    public Bank(int number, double balance, String email, String name) {
        System.out.println("bank account details");
        this.number = number;
        this.balance = balance;
        this.email = email;
        this.name = name;}



    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0 ) {
            System.out.println("Only " + this.balance + "available");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(this.balance);
        }
    }

    private int accountNumber;




    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private double balance;
    private String name;
    private String email;
    private int number;




}
