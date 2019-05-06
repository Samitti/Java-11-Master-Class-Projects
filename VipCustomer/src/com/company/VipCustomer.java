package com.company;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAdrees;

    public VipCustomer() {
        this("Sami","2000","a@y.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"a@y.com");
    }

    public VipCustomer(String name, String creditLimit, String emailAdrees) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdrees = emailAdrees;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdrees() {
        return emailAdrees;
    }
}
