package day31_arrayList;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {

        ArrayList<String>words = new ArrayList<>(); // declare or make
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
       System.out.println(words);

       words.remove(2);// returns the elements that you remove
       System.out.println(words);

      System.out.println(words.remove(0));
        System.out.println(words);

        words.clear();// empties the whole Arraylist
        System.out.println(words);

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);

        System.out.println(words.remove("Cow"));//capital letter here doesnt exist that return false, because that doesnt exist
        System.out.println(words);


        System.out.println(words.remove("chicken"));
        System.out.println(words);

        System.out.println("----------------------");

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(2);
        nums.add(4);
        nums.remove(0);
        System.out.println(nums);

        nums.remove(0);// 0 is int so it removes by index
        System.out.println(nums);

        Integer a =0;
       nums.remove(a);// a is Integer, so it removes by element the element it removes 0
        System.out.println(nums);

        nums.remove((Integer) 2);// casting the 2 to a Integer type, so I can remove the element 2,not the index 2
       System.out.println(nums);


        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer) 4);
        System.out.println(nums);


        }


    }

/*
String = hello

 */