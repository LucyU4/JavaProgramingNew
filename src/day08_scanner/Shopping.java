package day08_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item name");
        String item = " BAll";
      //  String item = input.nextLine();
        System.out.println("What is the item price");
        double price = 5.99;
        System.out.println("How many " + item + " Balls do you want");
        int quantity =3;

        String order = "Your total for " + quantity + " " + item + " is " + quantity * price;
        System.out.println(order);


    }
}
