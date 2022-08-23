package day07_Scanner;

//create a class GiftCard
//
//    declare and assign a gift card variable at 500
//    declare and assign times used at 3
//    print using giftcard and subtract 150 from the amount
//    reduce the times used by one
//    print using giftcard and subtract 99 from the amount
//    reduce the time used by one
//    print information at the end

public class GiftCard09 {

    public static void main(String[] args) {

        double giftCard = 500;
        int uses = 3;
        System.out.println(" Using giftCard. $ 150 removed");
        giftCard -= 150; // giftCard = iftCard -150;
        uses --;
        System.out.println(" Using giftCard. $ 150 removed"  + giftCard );
        System.out.println(" Using giftCard. $ 150 removed"  + giftCard );
        System.out.println(" Using giftCard. $ 150 removed"  + giftCard );
        System.out.println( " number of times card can be used : " + uses);
        giftCard -= 150; // giftCard = iftCard -150;

    }
}
