package NightPractice;

import java.util.Scanner;

public class DaysInMonth {

    /*
    Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner journal = new Scanner(System.in);
        System.out.println("Please enter the name of the month");
        String month = journal.next();
        switch (month){
            case "February":
            System.out.println(month + "  28 days");
            break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(month +   "  30 days");
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(month + "  31 days");
                break;
            default:
                System.out.println("Invalid number for the month");
        }
    }

}
