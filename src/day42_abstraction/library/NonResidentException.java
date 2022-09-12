package day42_abstraction.library;

public class NonResidentException extends RuntimeException{

    public NonResidentException(){
        super("Not a resident");
    }
}
