package day10_ifStatemets;

import java.util.Scanner;

public class FizzBuzz {

    /* [IQ] Given a number n, print the output based on the following conditions:
    if the number is divisible by 3 print Fizz
    if the number divisible by 5 print Buzz
    if the number is divisible by 3 and 5 print FizzBuzz
    if the number is not divisible by and the print just the number
    ex:
    n = 10
    Buzz

    n = 12
    Fizz
    n =13
    12
    n = 15
    FizzBuzz

     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = input.nextInt();

     // int n =4;

      if(n% 3 == 0 && n % 5 ==0) {
          System.out.println("FizzBuzz");
      }else if(n % 3 == 0) {
          System.out.println("Fizz");
      } else if (n % 5 ==0){
              System.out.println("Buzz");
          }  else {
              System.out.println(n);
          }
      }
    }
//  boolean by3= n % 3 ==0;
  //  boolean  by5 = n % 5 == 0;
//
//
//