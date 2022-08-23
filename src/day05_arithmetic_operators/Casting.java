package day05_arithmetic_operators;

public class Casting {

   public static void main(String [] args) {
       int age = 40;
       long ageLong = age;       long num = 100;
       int numInt = (int) num;

       long boxes = 300000000L;

       float f = 14.5F;
       int i = (int) f;
       System.out.println(i);
       double d2 = i;
       System.out.println(d2);


   }


}
