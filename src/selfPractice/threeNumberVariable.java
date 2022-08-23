package selfPractice;

import java.util.Scanner;

public class threeNumberVariable {
   // Create three number variables
  //  Find and print which number is bigger between the three

 //   ex:
  //          50
    //        45
      //      100

   // output:
   //         100 is the biggest
   public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
        System.out.println(num1 + " is biggest");
    } else if (num2 > num1 && num2 > num3) {
        System.out.println(num2 + " is biggest");
    }else {
        System.out.println(num3 + " is biggest");
    }
}
}

