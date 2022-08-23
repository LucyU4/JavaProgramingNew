package NightPractice;

import java.util.Scanner;

public class Elevator {
    /*
    Hard coded is fine, but you can use Scanner to get values if you want to make them more dynamic

-----------------------------------------------------------

add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select the floor number");
        int floor = scan.nextInt();

                switch (floor) {
                    case 1:
                        System.out.println(floor + " Lobby, StarBucks, Amazon Pick Up ");
                        break;

                    case 2:
                        System.out.println(floor + "NASA, Cydeo, Discover");

                    case 3:
                        System.out.println(floor + "NASA, Cydeo, Discover");

                    case 4:
                        System.out.println(floor + "Rooftop, Lounge");

                    default:
                        System.out.println(" Invalid floor selected");
                }

        }
    }
