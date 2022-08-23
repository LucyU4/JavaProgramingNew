package NightPractice;

import java.util.Scanner;

public class Hotel {
    /*
    Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many days will be staying and how many guests?");
        int days = input.nextInt();

        System.out.println("How many party");
        int partySize = input.nextInt();

        String roomType="";
        double price = 0;

        switch (partySize){
            case 1:
              roomType = "single room";
              price = days * 100;
                System.out.println();
                break;
                case 2:
            roomType = "double room";
            price = days * 125;
            break;
            case 3:
                case 4:
                roomType =" Large Room";
                price = days *125;
                break;
                case 5:
                case 6:
                case 7:
                  roomType= "suite";
                  price =days * 5000;
                  break;
            default:
                System.out.println("Sorry we dont have any available rooms for hat size");



        }
        System.out.println("Party size:" + partySize + "\nRoom Type:" + roomType + "\nPrice:$" + price);
    }
}
