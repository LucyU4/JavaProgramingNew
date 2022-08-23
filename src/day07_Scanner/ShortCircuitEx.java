package day07_Scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println( true && true); // it comes out true
        System.out.println( false && true); // it comes out false
      //  System.out.println(5/0); // you cannot divide by 0

       // System.out.println(true && 5/0 == 0);
        System.out.println(true && 5/0 == 0);


        System.out.println(true || false);
        // if
        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count);

    }
    }


