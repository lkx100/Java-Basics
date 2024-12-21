import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
// 1. List to store product names
        ArrayList<String> productNames = new ArrayList<>();
        productNames.add("Laptop");
        productNames.add("Smartphone");
        productNames.add("Tablet");
        productNames.add("Headphones");
        productNames.add("Smartwatch");
// 2. Set to store unique categories
        Set<String> productCategories = new HashSet<>();
        productCategories.add("Electronics");
        productCategories.add("Accessories");
        productCategories.add("Gadgets");
// 3. Map to store product codes and their details (price and quantity)
        Map<String, String> productDetails = new HashMap<>();
        productDetails.put("P001", "Laptop Price: $1200, Quantity: 50");
        productDetails.put("P002", "Smartphone Price: $699, Quantity: 150");
        productDetails.put("P003", "Tablet Price: $399, Quantity: 200");
        productDetails.put("P004", "Headphones Price: $129, Quantity: 300");
        productDetails.put("P005", "Smartwatch Price: $199, Quantity: 120");

// 4. Display the product names
        System.out.println("Product Names: ");
        for (String productName : productNames) {
            System.out.println("-" + productName);
        }

// 5. Display the product categories
        System.out.println("\nProduct Categories: ");
        for (String category : productCategories) {
            System.out.println("-" + category);
        }

        System.out.println("\nProduct Details: ");
        for (Map.Entry<String, String> productDetailsEntry : productDetails.entrySet()) {
            System.out.println("-" + productDetailsEntry.getKey() + ": " + productDetailsEntry.getValue());
        }
    }
}
