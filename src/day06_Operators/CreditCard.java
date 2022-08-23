package day06_Operators;

public class CreditCard {
   // create a class GiftCard

   // declare and assign a gift card variable at 500
    //declare and assign times used at 3
   // print using giftcard and subtract 150 from the amount
   // reduce the times used by one
   // print using giftcard and subtract 99 from the amount
   // reduce the time used by one
  //  print information at the end
   public static void main(String[] args) {


int giftCard = 500;
int timeUsed = 3;

    System.out.println(" Amount in the card: " +  (giftCard = giftCard - 150) +  " remaining time balance: = " + timeUsed);

    System.out.println(" Amount in the card: " + (giftCard = giftCard - 99) +  " remaining time balance =  " + --timeUsed);
    System.out.println( " Total Amount Remaining = " +giftCard);
    System.out.println( " Total Time Remaining = " + timeUsed);


    //What is the value of a and b

   // int a = 8;
   // int b = a--;

    //what is a?
         //   what is b?;
    int a = 8;
    int b = a--;
int c = b--;
int d = b --;
    System.out.println(" a = " + a--);
    System.out.println("b = " +b);
    System.out.println("c = " +c--);
    System.out.println( " d = " + d--);
    System.out.println(" a = + b + c+ d");

    System.out.println("-------------------------");

   }
}
