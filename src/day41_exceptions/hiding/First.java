package day41_exceptions.hiding;

public class First {
    public static void  staticMethod(){
        System.out.println("Static method from First Class");
    }
    public void instanceMethodA(){
        staticMethod();

    }
public void instanceMethodB(){
        staticMethod();
}
}
