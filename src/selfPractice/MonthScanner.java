package selfPractice;

import java.util.Scanner;

public class MonthScanner {
//create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
//use the month number input to determine how many days are in that month.
//use the following data to help you determine the number of days in each month:
//	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
//	Months that has 30 days: 4, 6, 9, 11
//	Month that has 28 days: 2
//	ex:
//		12
//		31 days
//	ex:
//		9
//		30 days
public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();

        if(month ==  1){
        System.out.println("Jan");

        }else if (month == 2) {
        System.out.println("Feb");

        } else if (month == 3) {
        System.out.println("Mar");

        } else if (month == 4) {
        System.out.println("Apr");

       } else if (month == 5) {
        System.out.println("May");

        } else if (month == 6) {
        System.out.println("Jun");

       } else if (month == 7) {
        System.out.println("Jul");

       } else if (month == 8) {
        System.out.println("Aug");

       } else if
        (month == 9) {
        System.out.println("Sep");

       } else if
        (month == 10) {
        System.out.println("Oct");

       } else if

        ( month == 11) {
        System.out.println("Nov");

        }else {
        System.out.println("Dec");
    }
}
}