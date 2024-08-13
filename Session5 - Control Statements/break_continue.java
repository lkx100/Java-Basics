public class break_continue {
    public static void main(String[] args) {
        int pass = 5;
        for (int i = 1; i <= pass; i++) {
            System.out.print("Pass " + i + " : ");
            for (int j = 1; j <= 10; j++) {
                if (j % 2 == 0) continue;   // skipping iteration for even numbers
                if (j == 9) break;    // Exiting inner loop at j = 9
                System.out.print(j + " ");
            }
            System.out.println();
            if (i == 3) break;   // Exiting outer loop at pass (i) = 3
        }
    }    
}
