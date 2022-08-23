package day03_variables_variables;

public class publicclasStore {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store"); // combines(concatenates) the value of the numberOfItems variables with the characters 'in the store'
        numberOfItems =700; // reassigned 700 into the variable
        System.out.println(numberOfItems +  "  after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); // soutv



        double totalCost = 1_000_000.99; // 1,000.000.99 -> how we might want to write it, but commas are not valid java syntax, so we can use underscore in numbers, to improve readability
        System.out.println(totalCost);

        float f = 19.99F; // adding the letter f/F will tell the compiler this is a float number, not a double number, not a double number. The f is not printed, because that is part of the code, not the number

        float f2 =100;  // 100 is int type by default, and int is smaller than float, so there is no problem herr
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if I wanted
        // float f2 = 100F;
        // f2 =100.99F;

        long population = 8_000_000_000L; // adding L/L to the number will change the type from the in( the default) to a long type, because 8 billion was too big to be held in an int type
        System.out.println(population);




    }
}
