package day31_arrayList;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();// creates an empty ArrayList
        System.out.println(letters.size());// just created so its empty

        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('z');
        System.out.println(letters.size());// number of elements->4
        System.out.println(letters);


        // reading from the array: arrayName[Index]
        // reading elements from the Arraylist

        System.out.println(letters.get(0));// 0(zero) is the first character which is (j)
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        System.out.println(letters);

        letters.add(0,'$');
        System.out.println(letters);
        System.out.println(letters.get(1));

        letters.add(3,'8');
        System.out.println(letters);
        System.out.println(letters.get(2));

    }
}
