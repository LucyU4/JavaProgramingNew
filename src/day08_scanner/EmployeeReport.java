package day08_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {

        /*
        full name
        job title
        salary
        company hq
        full time

        Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println(" What is your Hourly Rate");
        double hourlyRate = input.nextDouble();

        System.out.println("What is thr average number of hours in a week");
        int hours = input.nextInt();

        double salary = hours * 52 * hourlyRate;

        System.out.println(" Where is te Company HQ");
        input.nextLine(); // empty one to catch to enter input
        String hqLocation = input.nextLine();

        System.out.println(" Are you full time: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make" + salary + " because they are fullTime" + " HQ" + hqLocation;
        System.out.println(report);
    }
}
