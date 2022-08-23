package MultiDimentionalArray;

import java.util.Arrays;

public class AnotherMultiDimentional {
    public static void main(String[] args) {
        /*
        Given a 2D int array find the max and min number from the whole array
       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }
       Max: 41
       Min -12
Extra: Find the max and min between each inner array
         */
        int[][] data = {{1, 5, 2, 23},
                {-12, 41, -5, -2},
                {1, 5, 1, 5} };

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < data.length; i++) {
            Arrays.sort(data[i]);

            if (data[i][0] < minimum) minimum = data[i][0];
            if (data[i][data[i].length - 1] > maximum) maximum = data[i][data[i].length - 1];
        }
        System.out.println("Minimum = " + maximum);
        System.out.println("Maximum = " + minimum);
    }
    }



