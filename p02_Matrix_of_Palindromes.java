package f02_Multidimentional_arrays_Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class p02_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = getArray(scanner);

        int arrNumbers = input[0];
        int elements = input[1];

        String[][] matrix = new String[arrNumbers][elements];

        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        int asciiValue = 97;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                char firstLetter = (char) (asciiValue + i);
                char middleLetter = (char) (asciiValue + i + j);
                char endLetter = (char) (asciiValue + i);

                String palindrome = String.format("%c%c%c", firstLetter, middleLetter, endLetter);

                matrix[i][j] = palindrome;
            }

        }

    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void printMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
