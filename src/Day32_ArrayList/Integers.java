package Day32_ArrayList;

import java.util.ArrayList;

public class Integers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);
        System.out.println(list);

        list.set(2, 10); // changes the element at index 2, to be the value of 10
        System.out.println(list);

        list.set(0, 2); // changing the first index to the value of 2
        System.out.println(list);

    }
}
