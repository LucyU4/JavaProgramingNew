package day41_exceptions.hiding;

public class Second extends First{

    public static void staticMethod(){
        System.out.println("Static metod from Second");
    }
    public void instanceMethod(){
        staticMethod();

    }
}
