package day42_abstraction.library;

public class Library {
    public static String getLibraryCard(String city) {
        String message = "Library Card Created";
        if (city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("Mclean")) {
            return message;
        } else {
            throw new NonResidentException();
        }
    }
public static String borrow (boolean checkOut) throws FailToCheckException {
    String result= "Enjoy your book";
    if(checkOut) {
        return result;
    }else{
        throw new FailToCheckException();
        }

    }

}
