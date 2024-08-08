public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1, 0, 5, 9, 2, 1};
        int[] unique = new int[arr.length];
        for (int i = 0; i < arr.length; i++) unique[i] = -1;
        int total_unique_elements = 0;
        for (int i = 0, index = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] == arr[i]) isUnique = false;
            if (isUnique) {
                total_unique_elements++;
                unique[index++] = arr[i];
            }
        }
        System.out.println("Total Unique Elements: " + total_unique_elements);
        System.out.print("Unique Elements: ");
        for (int i : unique)
            if (i != -1) System.out.print(i + " ");
    }    
}
