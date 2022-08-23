package NightPractice;

import java.util.Scanner;

public class OceanDriver {

    //create a class Diver
    //You are diving in the ocean. Your oxygen tank has a certain level (number)
    //declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
    //    Above 90 - Your tank is full
    //    Above 80 - Still okay
    //   	Above 70 - Don't go too far
    //   	Above 60 - Start to head back
    //    Above 50 - Be careful now you  at 50%
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();


        if (a > 90){
            System.out.println(" your tank is full");
        } else if (a >= 80 && a < 90) {
            System.out.println("still okay");
        } else if (a <= 70 && a > 80) {
            System.out.println("Dont go too far");
        } else if (a > 60 && a <= 70) {
            System.out.println("Start to head back");

        } else if (a > 50 && a <= 60) {
            System.out.println("Be careful now you are at 50%");

        } else {
            System.out.println("Danger");


            System.out.println(a + " please enter the oxygen level between 50-9");
        }
    }

}

