package f02_Multidimentional_arrays_Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class p03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parameter = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[parameter][parameter];

        fillTheMatrix(scanner, matrix);

        int firstDiagonal = sumPrimaryDiagonal(matrix);
        int secondDiagonal = sumSecondaryDiagonal(matrix);


        int difference = Math.abs(sumPrimaryDiagonal(matrix) - sumSecondaryDiagonal(matrix));

        System.out.println(difference);
    }
    //2. Намираме сумата на главния диагонал
    public static int sumPrimaryDiagonal(int[][] matrix) {
        int row = 0;
        int col = 0;

        int sumMainDiagonal = 0;

        while (row <= matrix.length - 1 && col <= matrix.length - 1) {
            sumMainDiagonal += matrix[row][col];

            row++;
            col++;
        }

        return sumMainDiagonal;
    }
    //3. Намираме сумата на второстепенния диагонал
    public static int sumSecondaryDiagonal(int[][] matrix) {
        int row = 0;
        int col = matrix.length - 1;

        int sumSecondaryDiagonal = 0;

        while (row <= matrix.length - 1 && col >= 0) {
            sumSecondaryDiagonal += matrix[row][col];

            row++;
            col--;
        }

        return sumSecondaryDiagonal;
    }
    //1. Прочитеме матрицата от консолата
    private static void fillTheMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
