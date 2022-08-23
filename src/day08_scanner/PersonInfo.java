package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    /*
    ask for firstname
    ask for last name
    ask for
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you firstname");

        String firstName = input.next();
        System.out.println(" Please enter your last name");
        String lastName = input.next();
        input.nextLine(); // for enter input or next line

        System.out.println( " Please enter your address");
        String address = input.nextLine();


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);



    }
}
