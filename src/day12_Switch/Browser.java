package day12_Switch;

public class Browser {
    public static void main(String[] args) {
        String browser = "safari";
        switch(browser){
            case"chrome" :
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("Opening in safri");
           default:
                System.out.println("Opening in chrome by default");
              
        }
    }
}
