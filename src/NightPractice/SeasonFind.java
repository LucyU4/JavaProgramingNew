package NightPractice;

public class SeasonFind {
    /*
    Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat

     */
    public static void main(String[] args) {

        String month = "August";
        String Season = " ";
        String Clothes = " ";

        switch (month) {
            case "December":
            case "January":
            case "February":
                Season = " Winter";
                Clothes = " Cozy Jacket, Gloves and Scarf";

                break;

            case "March":
            case  "April":
            case "May":
                Season = " Spring";
                Clothes = " Beautiful Clothes, Flower Shirt";
                break;
            case "June":
            case "July ":
            case "August":
                Season = " Summer";
                Clothes = " Skirt, tank top";
            case "September":
            case "October":
            case "November":
                Season = " fall";
                Clothes = " Skirt, tank top";
                break;
            default:
                System.out.println("Sorry worng season number");
        }
                System.out.println(month + " it is " + Season +" so change" +  "  Clothes ");
        }


    }

