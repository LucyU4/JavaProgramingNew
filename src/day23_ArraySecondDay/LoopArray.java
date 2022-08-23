package day23_ArraySecondDay;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {4, 213, 6};
        //print whole array
        System.out.println(Arrays.toString(nums));
        //print each on a separate line had coded index
        System.out.println("hardcoded:");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);


        //  printing each with for loop
        System.out.println("with for loop");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }

        //create your own printing format:
        System.out.println("Our Own format");
        String arrayAsString = "Array ~";
        for (int i = 0; i < nums.length; i++) {
        arrayAsString += nums[i] + " |";
    }

            arrayAsString +="~End";
        System.out.println(arrayAsString);


        // go through with for each loop
        System.out.println("for each loop");

        for(int eachNumber : nums) {//read every element from the array, beginning to end
            System.out.println(eachNumber);// eachNumber == nums[i] --> these are the same

        } }}

