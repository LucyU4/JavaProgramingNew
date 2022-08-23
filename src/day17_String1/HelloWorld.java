package day17_String1;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");

        // infinite loo, doesnt stop
        //while (true){
       // System.out.println("Hello Wold");
        // print 50 times

        int counter = 0; // 1 loop counter <= 50

        while(counter <50){
            System.out.println("Hello World " + counter);
            counter++;// this line add 1 to the number each iteration, it allows the loop to stop at some point
        }
    }
}
