import java.util.Scanner;
import java.util.*;
// public class test {
//     public static void main(String [] args) {
//         // ArrayList
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         arr1.add(1);
//         arr1.add(2);
//         arr1.add(3);
//         System.out.println("Arr1: " + arr1);
//     }
// }

class Car { 
    String make; 
    String model; 
    int year; 
 
    // Constructor with only make 
    public Car(String make) { 
        this.make = make; 
        this.model = "Unknown"; // Default model 
        this.year = 0; // Default year 
    } 
 
    // Constructor with make and model 
    public Car(String make, String model) { 
        this.make = make; 
        this.model = model; 
        this.year = 0; // Default year 
    } 
 
    // Constructor with make, model, and year 
    public Car(String make, String model, int year) { 
        this.make = make; 
        this.model = model; 
        this.year = year; 
    } 
 
    public void displayInfo() { 
        System.out.println("Make: " + make); 
        System.out.println("Model: " + model); 
        System.out.println("Year: " + year); 
    } 
} 
 
public class Car_constructor_overloading { 
    public static void main(String[] args) { 
        Car car1 = new Car("Toyota"); 
        Car car2 = new Car("Honda", "Civic"); 
        Car car3 = new Car("Ford", "Mustang", 2021); 
 
        car1.displayInfo(); 
        System.out.println(); 
        car2.displayInfo(); 
        System.out.println(); 
        car3.displayInfo(); 

        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(nums[1][2]); 

    } 
}