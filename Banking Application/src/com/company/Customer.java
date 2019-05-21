package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerNamee;
    private ArrayList<double> transactions;

    public Customer(String customerNamee, double customerBalance) {
        this.customerNamee = customerNamee;
        this.customerBalance = customerBalance;
    }

    public String getCustomerNamee() {
        return customerNamee;
    }

    public void setCustomerNamee(String customerNamee) {
        this.customerNamee = customerNamee;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}

