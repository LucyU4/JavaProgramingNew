package MyselfPractice;

import java.util.Scanner;

public class ScannerMe {

    public static void main(String[] args) {

        // Ask the user to enter an integer number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num1  = input.nextInt();

        // As the user to enter decimal number

        System.out.println("Enter a decimal number:");
        double num2 = input.nextDouble();

        //Ask the user to enter a word

        System.out.println("Enter a word:");
        String str = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);


    }
}
