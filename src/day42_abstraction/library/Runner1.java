package day42_abstraction.library;

public class Runner1 {
    public static void main(String[] args) {
        try{
            System.out.println();   Library.borrow(false);
        }
        catch (FailToCheckException e){
            e.printStackTrace();
        }
        System.out.println(Library.getLibraryCard("Alexandria"));

    }
}
