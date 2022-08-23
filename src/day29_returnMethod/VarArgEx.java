package day29_returnMethod;

public class VarArgEx {
    public static void main(String[] args) {
        //  printAll(3,1,4,3);this is not valid because this is not an array
        int[] a = {3, 1, 3, 5};
        printAll(a);
        System.out.println();
        //dynamic(a); this works
        dynamic(4, 1, 4, 5, 2);
        System.out.println();
        dynamic("hello","monday","java");

    }

    public static void printAll(int[] nums) {
        for (int each : nums) {
            System.out.println(each + " ");
        }
    }

    public static void dynamic(int... nums) {// int ... num is the same as int[]nums
        for (int each : nums) {
            System.out.println(each + " ");
        }
    }

    public static void dynamic(String... words) {// String...words is the same as a String[] words
        for (String each : words) {
            System.out.println(each + " ");
        }
    }
}