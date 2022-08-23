package day11_if_Statements.Assignments;

public class Amazon {
    public static void main(String[] args) {
        // items price
        // prime

        double price = 100.99;
        boolean isPrime = false;

        if(isPrime) {
            System.out.println("Free 2 day shipping");
        }else{
            //you don't have prime

            if(price >=25) {
                System.out.println("Free shipping available");

            }else {
                System.out.println("Shipping cost is $2.99");

                // if the boolean isPrime is true if the block runs
                // if the boolean is prime is false if the else block, which has a if statement
                //that condition is checked
               // price >= 25: free shipping
                    //    false: pay for shipping


            }
        }
    }
}
