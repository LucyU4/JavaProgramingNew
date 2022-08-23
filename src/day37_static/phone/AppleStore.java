package day37_static.phone;

import day37_static.phone.Iphone;

public class AppleStore {
    public static void main(String[] args) {
Iphone iphone1 = new Iphone("Iphone x", " Black", 100, 256);
        System.out.println(iphone1);
        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);


        // we would use the object to access to static variables, but better to use the class name

        Iphone iphone2 = new Iphone("Iphone 13", " Blue", 1450, 256);
        System.out.println(iphone2);
    }
}
