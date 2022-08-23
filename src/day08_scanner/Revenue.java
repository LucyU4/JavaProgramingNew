package day08_scanner;

import java.util.Scanner;

public class Revenue {
/*Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
 */
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);//we are giving the message to the console
    System.out.println("Enter the item price");
    double price = scan.nextDouble();// 5.99 this is how we do the program before
    System.out.println(" Enter the quantity");
    int quantity = scan.nextInt();// 6; if we leave just this? its hard coded . we have to understand the read the nextDouble() into the console
    System.out.println(" Revenue: $" + price * quantity);
   // scan
}
}
