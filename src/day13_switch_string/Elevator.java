package day13_switch_string;

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

        int floor  =  2;
        String companies;

        switch (floor){

            case 1:
                companies =  " Lobby, StarBucks, Amazon Pick Up";
                break; // stops the switch
            case 2:
                companies =  "NASA, Cydeo, Discover ";
                break;// stops the switch

            case 3:
                companies =  " Uber, Lyft, Chase";
                break;// stops the switch
            case 4:
                companies =  " Rooftop, Lounge";
                break;// stops the switch

            default:
                companies = " invalid floor selected";
        }
        System.out.println("Floor"  + floor + ": "  + companies);
        }
    }

