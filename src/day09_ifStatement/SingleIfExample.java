package day09_ifStatement;

import java.sql.SQLOutput;

public class SingleIfExample {
    public static void main(String[] args) {

        if(true) {
            System.out.println("Hello");// when the boolean is true this will run

            System.out.println("break");// normal print statement, not part of any if
        }

        if(true) {
            System.out.println("Bye");// the boolean was false , this will NOT RUN

            System.out.println("___________________________");

            int year = 2022;

            if(year == 2020 || year == 2021) {
                System.out.println("Stay home");
                System.out.println("Wash your hands");
                System.out.println("social distance");
            }
                System.out.println("________________________________");

                double price = 39.99;
                if (price >= 20) {
                    System.out.println("Free Shipping");
                }
                System.out.println("_______________________________");
            }
        }
    }