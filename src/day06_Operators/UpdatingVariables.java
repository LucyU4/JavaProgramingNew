package day06_Operators;

public class UpdatingVariables {
    public static void main(String[] args) {
        int n = 10;
        // reasign a new value
        n = 20;
        int a = 3;
        a = a + 4; // a+4 --->> 3+4 = 7  gets score as the new value for a

        int b =15;
        b += 9; // b =b + 9;
        b += 1;
        int z = 10;
        z++; // this could have been updating number by 1
        z = 11;
        System.out.println(z);


        System.out.println();

        int java = 8;
        int testing = --java; // predecrement right away
        System.out.println(java); // 8 --> 7
        System.out.println(testing); //7

        int x = 7;
        int y = x--; // post decrement
        System.out.println(x);// value of x? is = 7 so when i run it i should see 6
        System.out.println(y);// 7
        System.out.println( x * y );



    }
}
