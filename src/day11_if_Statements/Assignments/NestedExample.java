package day11_if_Statements.Assignments;

public class NestedExample {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;

        if(a){
            System.out.println(1);
            if (b) {
                System.out.println(2);
            }

               // when a = true      // when a =
                //     b = true              b =
                // output:          // output
                         // 1
                          // 2



        }
    }
}
