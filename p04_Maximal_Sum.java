package f02_Multidimentional_arrays_Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class p04_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArr(scanner);

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];
        int[][] innerMatrix = new int[3][3];

        fillTheMatrix(scanner, matrix);

        int maxSum = Integer.MIN_VALUE;
        int maxMatrixRow = 0;
        int maxMatrixCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {

                int sum3x3 = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum3x3 > maxSum) {
                    maxSum = sum3x3;
                    maxMatrixRow = row;
                    maxMatrixCol = col;
                }


            }
        }
        System.out.printf("Sum = %d\n", maxSum);

        printMatrix(matrix, maxMatrixRow, maxMatrixCol);
    }

    private static void printMatrix(int[][] matrix, int startRow, int startCol) {
        for (int i = startRow; i <= startRow + 2 ; i++) {
            for (int j = startCol; j <= startCol + 2 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArr(scanner);
        }
    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}
