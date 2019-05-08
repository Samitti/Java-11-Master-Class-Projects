package com.company;

public class Car extends Vehicle {

    private String brand;
    private String type;

    public Car(String catagory, String brand, String type) {
        super(catagory);
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
}
