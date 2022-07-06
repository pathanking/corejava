package core;

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] multi = {
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("multi["+i+"]["+j+"] = "+multi[i][j]);
            }
        }
    }
}
