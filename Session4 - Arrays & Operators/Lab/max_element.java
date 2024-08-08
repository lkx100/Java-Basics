public class max_element {
    public static void main(String[] args) {
        int[] arr = {45, 2, 7, 10, -1, 5, 24};
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > max) max = i;
        System.out.println("Maximum Element: " + max);
    }    
}
