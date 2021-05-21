package com.pack;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // You are able to call multipule constructors. You can make a default constructors
    public VipCustomer() {
        this("Default Name", 0.0, "No Email Address");
        System.out.println("Default Constructor");
    }

    public VipCustomer(String name,double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
      this.name = name;
      this.creditLimit = creditLimit;
      this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
