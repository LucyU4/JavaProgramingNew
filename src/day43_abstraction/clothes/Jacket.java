package day43_abstraction.clothes;

public class Jacket extends Clothes implements HasHood {
    @Override
    public void wear() {
        System.out.println("Wearing the jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Puttimg on jacket hood");
    }
}
