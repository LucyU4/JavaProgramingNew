package day45_poymorphism.building;

public class OfficeBuilding extends Building implements HasElevator {

    /*
Create an class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
     */

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent office Space");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("we are going to Floor + floor");
    }

    public String toString() {
        return super.toString() + " Number of floors: " + numberOfFloors;
    }
}