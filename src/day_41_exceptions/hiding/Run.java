package day_41_exceptions.hiding;

public class Run {
    public static void main(String[] args) {
        First.staticMethod();
        Second.staticMethod();
        System.out.println();
        new First().instanceMethodA();
        new First().instanceMethodB();
        new Second().instanceMethodA();
        new Second().instanceMethodB();


    }

}
