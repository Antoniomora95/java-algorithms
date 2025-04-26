package com.amora;

public class UniquePaths {
    private static int uniquePaths(int m, int n) {
        int [][] matrix = new int[m][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                // you have to get value at previous row, same column
                // plus same row, previous column
                if (row == 0 || col == 0) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] = matrix[row - 1][col] + matrix[row][col - 1];
                }
            }
        }
        return matrix[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int result = UniquePaths.uniquePaths(m, n);
        System.out.printf("Number of unique paths for m: %s, and n: %s is: %s", m, n, result+"\n");

        int m2 = 3;
        int n2 = 3;
        int result2 = UniquePaths.uniquePaths(m2, n2);
        System.out.printf("Number of unique paths for m: %s, and n: %s is: %s", m2, n2, result2+"\n");
    }
}
