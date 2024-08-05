public class matrix_initialization {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 3, 4},
            {5, 3, 2, 8},
            {3, 6, 1, 0}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }    
}
