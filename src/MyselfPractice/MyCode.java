package MyselfPractice;

public class MyCode {
    public static void main(StringMethodCode[] args) {

        /*
        Operators used to construct complex conditions
        - logical AND operator: &&
        -Logical OR operator: ||
        - Logical NOT operator: !
        these operators are used between Boolean values, and the result is also a Boolean value


         COMBINING CONDITIONS
         -AND: condition_1 && condition_2 && condition_n
                -> true only if all conditions are true
         -OR: condition_ 1 || condition_2 || condition_n
               -> true if at least one condition is true
         -NOT:  negates a boolean value
            example -> !true = false
        */


        boolean b1 = true && true;// result is true because b1 is true
        boolean b2 = b1 && false && true;// false because we used && operators and its because we have false
        boolean b3 = b2 || true; //true because we have true automatically we got true so b3 is true
        boolean b4 = !b2; // true b4 is true and  b2 is false -> false will be false because NOT all the condition is true
        boolean b5 = !(b4 && b2); // true

        //if isRaining || isCold -> wear a jacket
          // if n>= 1 && n<=10 -> is between 1 and 10
    }
}
