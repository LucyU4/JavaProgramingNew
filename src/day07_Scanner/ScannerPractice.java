package day07_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    //Create a program that will ask the user to enter a price and quantity and then calculate //the revenue. revenue = price × quantity.
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println(" The price");
    double quantity = input.nextDouble();
        System.out.println(" The Quantity");
    double price = input.nextDouble();
        System.out.println(" TOTAL REVENUE" );
    double revenue =price *quantity;
        System.out.println(revenue);





}
}
