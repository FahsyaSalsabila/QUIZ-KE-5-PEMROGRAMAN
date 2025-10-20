public class Soal12 {

    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 2, 1},
            {1, 2, 10, 2},
            {4, 3, 1, 3},
            {2, 1, 2, 15}
        };

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];       
        String[][] path = new String[rows][cols]; 

        dp[0][0] = grid[0][0];
        path[0][0] = "(0,0)";

        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
            path[0][j] = path[0][j - 1] + " → (" + 0 + "," + j + ")";
        }

        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
            path[i][0] = path[i - 1][0] + " → (" + i + "," + 0 + ")";
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                    path[i][j] = path[i - 1][j] + " → (" + i + "," + j + ")";
                } else {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                    path[i][j] = path[i][j - 1] + " → (" + i + "," + j + ")";
                }
            }
        }

        System.out.println("Jalur terbaik: " + path[rows - 1][cols - 1]);
        System.out.println("Total Energi Maksimum: " + dp[rows - 1][cols - 1]);
    }
}
