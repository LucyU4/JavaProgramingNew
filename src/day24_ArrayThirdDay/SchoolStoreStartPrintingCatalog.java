package day24_ArrayThirdDay;

public class SchoolStoreStartPrintingCatalog {
    public static void main(String[] args) {
        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

// print the catalog
        System.out.println("Full Catalog\nID\t| NAME | PRICE");
        for(int i = 0; i < items.length; i++){
            System.out.println(itemId[i] + " | " + items[i] + " | $" + prices[i]);
        }

    }
}


