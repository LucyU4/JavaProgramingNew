package day29_returnMethod;

import day28_Methods.Numbers;

public class TestCalling {
    public static void main(String[] args) {

        int[] arr ={3,1,4,5};
       int sum = ExtraPractice.sumFromArray(arr);
        System.out.println(sum);
        double value = ExtraPractice.currencyConverter("won",130);
        System.out.println(value);
        Numbers.checkNum(9);


        }

    }

