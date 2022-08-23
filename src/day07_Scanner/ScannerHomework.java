package day07_Scanner;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {

       //Create a program that will ask the user to enter two numbers. Add the numbers and //print the result
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first number");
        int number1 = input.nextInt();

        System.out.println(" Enter second number");
       int number2 = input.nextInt();

       int addTwoNumber = number1 + number2;
        System.out.println(" Total Number" + addTwoNumber);
        System.out.println();
    }

}
