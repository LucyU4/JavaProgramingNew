package MentorHomework;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
         */
        ArrayList<String>item = new ArrayList<>();// creates an empty ArrayList

            item.add("Hat");
            item.add("shoes");
            item.add("Jacket");
            item.add("towel");
            item.add("car");
        System.out.println(item);

        item.add(1,"jacket");
        System.out.println(item);

        item.add(0,"towel");
        System.out.println(item);

        item.add(1,"car");
        System.out.println(item);

    }

    }

