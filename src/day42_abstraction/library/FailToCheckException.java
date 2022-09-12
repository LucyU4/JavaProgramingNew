package day42_abstraction.library;

public class FailToCheckException extends Exception{

    public FailToCheckException(){
        super("Fail to checkout");
    }
}
