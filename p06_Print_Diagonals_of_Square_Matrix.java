package f02_Multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p06_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = getArray(scanner);
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        int row = size - 1;
        int col = 0;

        while (row >= 0 && col <= size) {
            System.out.print(matrix[row][col] + " ");

            row--;
            col++;
        }
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
