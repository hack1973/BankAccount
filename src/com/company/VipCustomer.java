package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Name", 1000.00, "email@domain.com");
        //System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, String email) {
        this(name, 1000.00, "email@domain.com");
        //System.out.println("Partial constructor called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        //System.out.println("Full constructor called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
