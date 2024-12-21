import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.addFirst("David"); // Add at the beginning
        list.addLast("Eve");

        System.out.println("Initial LinkedList: " + list);
        // Access elements
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        System.out.println("First element:" + firstElement);
        System.out.println("Last element:" + lastElement);

        list.removeFirst(); // Remove the first element
        list.removeLast(); // Remove the last element
        list.remove("Charlie"); // Remove a specific element by value

        System.out.println("LinkedList after removals: " + list);
        // Traverse the LinkedList
        System.out.println("Traversing the LinkedList:");
        for (String name : list) {

            System.out.println(name);
        }
    }
}
