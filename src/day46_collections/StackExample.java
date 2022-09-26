package day46_collections;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();//LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("At the top"+ stack.peek());
        stack.pop();
        System.out.println("At the top now"+ stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop() + "was removed from the stack");
        System.out.println(stack);

        System.out.println(0);
    }
}
