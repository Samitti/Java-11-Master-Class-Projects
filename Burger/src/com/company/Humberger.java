package com.company;

public class Humberger {
    private String burgerName;
    private String breadType;
    private String meat;
    private double price;

    private int aditionalPrice = 0;
    private String aditional = "";


    public Humberger(String burgerName, String breadType, String meat, double price) {
        this.burgerName = burgerName;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public int getAditionalPrice() {
        return aditionalPrice;
    }

    public void setAditionalPrice(int aditionalPrice) {
        this.aditionalPrice = aditionalPrice;
    }

    public String getAditional() {
        return aditional;
    }

    public void setAditional(String aditional) {
        this.aditional = aditional;
    }

    public String aditionals(boolean lettuce, boolean tomato, boolean carrot, boolean chilly){



        if (lettuce){

            aditional += " Lettuce,";
            aditionalPrice += 5;
        }
        if (tomato){

            aditional += " Tomato,";
            aditionalPrice += 5;
        }
        if (carrot){

            aditional += " Carrots,";
            aditionalPrice += 5;
        }
        if (chilly){

            aditional += " Chilly.";
            aditionalPrice += 5;
        }

        return aditional;
    }

    public void makeBurger(){

        System.out.println("The Burger name is: " + burgerName + "\n" + " Bread Type: " + breadType + "\n" + " Meat: " + meat + "\n" + "Price: " + price +"\n" + " Aditionals: " + aditional + "\n" + "Aditional Price: " + aditionalPrice  + "\n" + " Total Price: " + (price + aditionalPrice));

    }
}

class HealthyBurger extends Humberger{

    public HealthyBurger( String meat) {
        super("Healthy Burger", "Brown rye", meat, 70);
    }

    public String aditionals(boolean lettuce, boolean tomato){



        if (lettuce){

           setAditional(getAditional() + " Lettuce,");
           setAditionalPrice(getAditionalPrice() + 5);
        }
        if (tomato){

            setAditional(getAditional() + " Tomato");
            setAditionalPrice(getAditionalPrice() + 5);
        }


        return getAditional();
    }

}

class DeluxeBurger extends Humberger{

    public DeluxeBurger( String meat) {
        super("DeluxeBurger", "Round ", meat, 70);
    }

    public String aditionals(){





            setAditional(getAditional() + " Chips,");

            setAditional(getAditional() + " Drinks");



        return getAditional();
    }

}
