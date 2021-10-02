package quiz;
public class quiz6 {

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 2, c2 = 3;
        int[][] 1st = { {4,5,6,7}, {14,15,16,17} };
        int[][] 2nd = { {2,3,4,5}, {9,10,11,12} };

       
        int[][] p = mM(1st, 2nd, r1, c1, c2);

        
        displayp(p);
    }

    public static int[][] mM(int[][] 1st, int[][] 2nd, int r1, int c1, int c2) {
        int[][] p = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    p[i][j] += 1st[i][k] * 2nd[k][j];
                }
            }
        }

        return p;
    }

    public static void displayp(int[][] p) {
        System.out.println(" two matrices is: ");
        for(int[] row : p) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}