package day25_ArraysFourthDay;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {

        int[] arr = {6,23,100,240,2000};
        //           0  1  2   3   4

        System.out.println(Arrays.binarySearch(arr,240));
        System.out.println(Arrays.binarySearch(arr,2000));
        System.out.println(Arrays.binarySearch(arr,6));
        System.out.println(Arrays.binarySearch(arr,25));// because it doesn't exist
        System.out.println(Arrays.binarySearch(arr,500));// because it doesn't exist


    }
}
