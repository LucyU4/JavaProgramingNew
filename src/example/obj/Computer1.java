package example.obj;

public class Computer1 {
    public static void main(String[] args) {
        Computer computer = new Computer(1500," MacBook Pro","Silver" );
        System.out.println(computer);

        System.out.println("Computer.Brand : has battery:"  + Computer.hasBattery);
        System.out.println("Computer.Brand:  has Screen: " + Computer.hasScreen);
        System.out.println("Computer.Brand:  has Memory: " + Computer.hasMemory);



    }
}
