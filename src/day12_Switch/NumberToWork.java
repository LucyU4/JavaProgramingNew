package day12_Switch;

import java.security.spec.RSAOtherPrimeInfo;

public class NumberToWork {

    public static void main(String[] args) {
        /*
        number from 1-5
        convert the number t word
        1--> one
        2--->  two
        ' '
        5--> five
        default case
         */

        int number =3;
                switch(number){
                    case 5: System.out.println("Five");
                         break;
                    case 4: System.out.println("Four");
                        break;
                    case 3: System.out.println("Three");
                        break;
                    case 2: System.out.println("Two");
                        break;
                    case 1: System.out.println("One");
                        break;
                    default:
                        System.out.println("Number should be between 1 and 5");

                }

    }
}
