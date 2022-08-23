package example.obj;

public class Computer {
    /*4
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

     */

public double price;
public String brand;
public String color;

public static boolean hasScreen;
public static boolean hasBattery;
public static boolean hasMemory;

static {
    System.out.println("Computer information \n" + "---------------------");
    hasScreen = true;
    hasBattery = true;
    hasMemory = true;


}
public Computer(double price, String brand, String color){
    this.price = price;
    this.brand = brand;
    this.color = color;

}

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

