package f02_Multidimentional_arrays_Excersice;

import java.util.Scanner;

public class p01_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parameters = scanner.nextLine().split(", ");
        int size = Integer.parseInt(parameters[0]);
        String patternType = parameters[1];

        int[][] matrix = new int[size][size];

        switch (patternType) {
            case "A":
                fillingMatrixPatternA(matrix);
                break;
            case "B":
                fillingMatrixPatternB(matrix);
                break;
        }

        printMatrix(matrix);
    }

    public static void fillingMatrixPatternA(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = count++;
            }
        }
    }

    public static void fillingMatrixPatternB(int[][] matrix) {
        int count = 1;
        int col = 0;

            while (col < matrix.length) {
                if(col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = count++;
                    }
                }else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = count++;
                    }
                }
                col++;
            }
    }

    public static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
