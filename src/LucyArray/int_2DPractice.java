package LucyArray;

public class int_2DPractice {
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

        int[][] twoDimentional = {{1,1},{2,2},{3,3},{4,4}};
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 2; j++){
                System.out.print(twoDimentional[i][j] + " ");
            }
            System.out.println();
        }
    }
}




