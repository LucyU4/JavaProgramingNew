package day28_Methods;

import java.util.Scanner;

public class Numbers {

    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero

     */

    public static void checkNum(int n){

        if( n >0){
            System.out.println("Positive");
        }else if(n< 0){
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        checkNum(51);// method,  type because these are argument
        checkNum(0);// method,  type because these are argument
        checkNum(-14);// method,  type because these are argument

        Scanner input = new Scanner(System.in);// hard coded
        checkNum(input.nextInt());

       int n =3;
       checkNum(n);// with variable
    }
}
