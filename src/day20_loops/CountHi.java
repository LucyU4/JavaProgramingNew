package day20_loops;

public class CountHi {

    public static void main(String[] args) {
         // the goal on this is to count how many //times hi is the String
        String s = "abhicdhelhilofrhiiday";
        // approach 1: while loop and delete the first occurrence each time

        int count =0;

        while(s.contains("hi")){
            count++;
            s =s.replaceFirst("hi","" );// replace the first occurrence
        }
        System.out.println(count);
    }
}
