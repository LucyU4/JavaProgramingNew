package day24_ArrayThirdDay;

public class SchoolStoreMaxLogic {
    public static void main(String[] args) {
        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        System.out.println();
        // Find the information for the most expensive item
        double maxPrice = prices[0]; // first element is good default
        int indexOfMax = 0;

        for(int i = 0; i < prices.length; i++){ // we can start from int = 1 because the first price is already the default

            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }

        }

        System.out.println("Most Expensive item: " + itemId[indexOfMax] + " | " + items[indexOfMax] + " | $" + prices[indexOfMax]);

    }
}