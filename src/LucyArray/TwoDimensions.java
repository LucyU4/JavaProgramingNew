package LucyArray;

public class TwoDimensions {
    public static void main(String[] args) {
        int [][] array=new int[6][4];


        int [] firstrow= new int[]{10, 20, 30, 40};
        int [] secondrow= new int[]{50, 60, 70, 80};


        System.out.println("array[0][1] = " + array[0][1]); //20

        System.out.println("array[0][0] = " + array[0][0]); //10
        System.out.println("array[0][1] = " + array[0][1]); //20
        System.out.println("array[0][2] = " + array[0][2]); //30
        System.out.println("array[0][3] = " + array[0][3]); //40
        System.out.println("array[1][0] = " + array[1][0]); //50
        System.out.println("array[1][1] = " + array[1][1]); //60


    }
}
