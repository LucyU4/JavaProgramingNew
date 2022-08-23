package day37_static.phone;

public class Iphone {
    // instance variables;
    String model;
    String color;
    double price;
    int storage;

    //static variables;
    static String os;
    static String brand;

    // static block used to initialise static variables
    static {
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
        System.out.println("Hello Lucy Focus and Keep going, Work hard on this!");

    }


    // constructor used to initialize instance variables
    public Iphone(String model, String color, double price, int storage) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
        os = "IOS";
    }
    /*
    Difference between static block & Constructor
    static block will run once, the first time the class us used-->> we can write a code in here
    constructor will be called every time an object is made
     */

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
