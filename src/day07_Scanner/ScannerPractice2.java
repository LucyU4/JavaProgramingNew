package day07_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        //Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
        //    Determine if the angles make a triangle, which means the angles add to 180.0
        //    and
        //    Determine if the angles make a circle, which means the angles add to 360.0

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  angle 1 numbers");
        double angle1 = input.nextDouble();

        System.out.println(" Enter angle 2 numbers");
        double angle2 = input.nextDouble();

        System.out.println(" Enter angle 3");
        double angle3 = input.nextDouble();

        double totalAngleNumbers = angle1 + angle2 + angle3;

        boolean Circle = totalAngleNumbers == 360;
        boolean triangle = totalAngleNumbers == 180;

        System.out.println(" Is a Circle" +  Circle);
        System.out.println(" Is a Triangle " + triangle);
    }
    }
