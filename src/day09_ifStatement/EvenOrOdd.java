package day09_ifStatement;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }

        if (num % 2 == 1) { // != this means 0
            System.out.println(num + "  is odd");
        }
    }
}