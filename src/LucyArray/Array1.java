package LucyArray;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        for (String each : countries) {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
            if (each.length() % 2 == 0) {
                System.out.println("" + each.charAt((each.length() - 2) / 2) + each.charAt(each.length() / 2));
            } else {
                System.out.println(each.charAt(each.length() / 2));
            }
        }
        for (String each : countries) {
            System.out.println(Arrays.toString(each.toCharArray()));
        }
    }
}


