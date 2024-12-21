import java.util.HashMap;
import java.util.Scanner;

public class ProductPriceLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> map = new HashMap<>();

        map.put("Laptop", 90000.00);
        map.put("Samsung Galaxy S6", 60000.00);
        map.put("Iphone", 100000.00);
        map.put("Tablet Galaxy S6", 17000.00);
        map.put("Samsung Galaxy S7", 60000.00);

        System.out.println("Enter product name to retrieve its price: ");
        String productname = sc.nextLine();

        if (map.containsKey(productname)) {
            double price = map.get(productname);
            System.out.println("Product price is: " + price);
        } else {
            System.out.println("Product not found");
        }
    }
}
