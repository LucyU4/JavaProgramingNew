package day06_Operators;

public class UrinaryExample {
    public static void main(String[] args) {
        int n = 0; //0
        n++;       //1 post increment, value becomes 1
        System.out.println(n); //1
        ++n; // pre increment, value becomes 2
        System.out.println(n); // 2

        System.out.println(++n); // pre increment, value becomes 4 then it prints the value
        System.out.println("post number:");
        System.out.println(n++);// post increment, prints the current value, which is 4, then it will increment by 1
        System.out.println(n++);// post increment, prints the current value, which is 4, then it will increment by 1
        System.out.println("-------------------------------");

        int x= 4;
        int y = x;
        int z = ++x; // pre increment
        System.out.println("x = " + x );// 4 ----> 5
        System.out.println("y = " + y);// 4
        System.out.println("z = " + z); // 5

        System.out.println("----------------------");

        // decrementing
        int candy = 5;
        System.out.println(" Your kid asks for candy, you have  candy " + candy  );
        System.out.println(" You give them one, so now you have " + -- candy); // pre decrement, subtract 1 first, then print it
        System.out.println(" The sibling comes in and they want one, you check how many is in the jar and you give them one "  + candy--); // post the decrement
        System.out.println(" Total candy in jar now " + candy );

        // USE CASE : counting:
        // your name, we want to find how many times your name as the letter "a"
        int counter = 0;
        counter++;
        // we find another a.
        counter++;





    }
}
