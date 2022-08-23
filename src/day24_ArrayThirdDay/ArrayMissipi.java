package day24_ArrayThirdDay;

import java.util.Arrays;

public class ArrayMissipi {
    public static void main(String[] args) {


        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));  // char[]
        System.out.println(Arrays.toString(str4.split(""))); // String[]


    }
}


