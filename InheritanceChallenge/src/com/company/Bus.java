package com.company;

public class Bus extends Car {

    private int numberOfSeats;
    private int busNumber;
    private String busType;

    public Bus(String catagory, String brand, String type, int numberOfSeats, int busNumber, String busType) {
        super(catagory, brand, type);
        this.numberOfSeats = numberOfSeats;
        this.busNumber = busNumber;
        this.busType = busType;
    }



    public void getDetis(){

        System.out.println("Vehicle "+ getCatagory());
        System.out.println("Brand " + super.getBrand());
        System.out.println("Yype " + super.getType());
        System.out.println("Number of Seats " + numberOfSeats);
        System.out.println("Bus Number " + busNumber);
        System.out.println("Bus Type " + busType);
    }


}

