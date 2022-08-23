package day10_ifStatemets;


import java.util.Scanner;

public class daysInMonth {
    //create an int variable to represent the month number, where 1 is January and 12 is December.
    // use the month number input to determine how many days are in that month.
    // use the following data to help you determine the number of days in each month:
    // Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    // Months that has 30 days: 4, 6, 9, 11
    //Month that has 28 days: 2
    //ex:
    //     12
    //    31 days
    // ex:
    //   9
    //   30 days

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number from 1-22");
        int month = input.nextInt();
        int day = 0;

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 3 || month == 4 || month == 5 || month == 11;
        if (has31Days) {
            day = 31;
        } else if (has30Days) {
            day = 30;
        } else if (has30Days) {
            day = 28;

            //multi branch determine the output of my program
            if (day > 0) {
                System.out.println("Month: " + month);
                System.out.println("Days in the month: " + day);
            } else {
                System.out.println(month + " is not valid data");

            }


        }
    }
}