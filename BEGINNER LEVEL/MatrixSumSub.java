public class MatrixSumSub {
    public static void main(String[] args) {
        
        int r = 2;
        int c = 2;

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        System.out.println("--- SUM (A + B) ---");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }

        System.out.println("\n--- SUBTRACTION (A - B) ---");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] - b[i][j]) + " ");
            System.out.println();
        }
    }
}
