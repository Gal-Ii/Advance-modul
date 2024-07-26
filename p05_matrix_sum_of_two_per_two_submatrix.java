package f02_Multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p05_matrix_sum_of_two_per_two_submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = getArray(scanner);

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = getArray(scanner);
        }

        int max = Integer.MIN_VALUE;
        int [][] innerMatrix = new int[2][2];

        for (int r = 0; r < matrix.length-1; r++) {
            for (int c = 0; c < matrix[r].length-1; c++) {
                int current = matrix[r][c];
                int right = matrix[r][c+1];
                int under = matrix[r+1][c];
                int diagonal = matrix[r+1][c+1];

                int sum = current + right + under + diagonal;

                if(sum>max){
                    max = sum;

                    innerMatrix[0][0] = current;
                    innerMatrix[0][1] = right;
                    innerMatrix[1][0] = under;
                    innerMatrix[1][1] = diagonal;
                }
            }
        }
        for (int[] arr:innerMatrix) {
            for (int r:arr) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
        System.out.println(max);
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
