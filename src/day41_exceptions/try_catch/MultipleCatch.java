package day41_exceptions.try_catch;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            System.out.println(1/5);
            String s = null;
            s.trim();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }catch (NullPointerException e){
            System.out.println("Second catch block");
        }
        System.out.println("END");// tjis has nothing to do with any try catch
    }
}
