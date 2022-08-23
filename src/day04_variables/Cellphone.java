package day04_variables;

public class Cellphone {
    public static void main(String[] args) {

        String brand = "Iphone";
        String model = "Iphone x";
        String color =  " Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("\t\tPhone information: \nBrand: " + brand);
        System.out.println(model  + " in " + color);
        System.out.println("With " + size + "gb the price is $" + price);
        System.out.println("sim type: "+ sim + " and has camera: " + hasCamera );

        String Report = "\t\t\tPhone information:\nBrand: " + brand + "\n" + model  + " in " + color +
                "\n" + " With " + size + "gb the price is $" + price +
                "\nsim type: " + sim + " and has camera: " + hasCamera;

        System.out.println("report");




    }
}
