package f02_Multidimentional_arrays_Excersice;

import java.util.*;

public class p06_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationAngle = scanner.nextLine().replace("Rotate(", "").replace(")", "");
        int rotationTimes = Integer.parseInt(rotationAngle) / 90;

        List<String> words = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            words.add(input);
            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = Collections.max(words, Comparator.comparing(String::length)).length();

        char[][] matrix = new char[rows][cols];

        fillMatrix(words, matrix);

        for (int rotation = 1; rotation <= rotationTimes; rotation++) {
            matrix = getRotateMatrix90(matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

    private static char[][] getRotateMatrix90(char[][] oldMatrix) {

        // редовете == броя на колоните на първия ред от старата матрица
        // колоните == броя на редовете от старата матрица
        int newRows = oldMatrix[0].length;
        int newCol = oldMatrix.length;
        char[][] newMatrix = new char[newRows][newCol];

        // обхождам старата матрица и местя елементите в новата матрица
        // колона: от 0 към последна
        // ред: последен към 0
        for (int col = 0; col < oldMatrix[0].length; col++) {
            int counter = 0;
            for (int row = oldMatrix.length - 1; row >= 0; row--) {
                char symbol = oldMatrix[row][col];
                newMatrix[col][counter] = symbol;
                counter++;
            }
        }

        return newMatrix;
    }

    private static void fillMatrix(List<String> words, char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {   //обхождаме матрицата
            String word = words.get(row);   //от този списък дай ми думичката, която стои на този индекс

            for (int col = 0; col < matrix[row].length; col++) {  // ще обходим колоните на този ред
                if (col <= word.length() - 1) {
                    matrix[row][col] = word.charAt(col);  //за този рд и тази колона дай ми символа, който стои в думата на тази колона
                } else {
                    matrix[row][col] = ' ';  //ako nqma bukva postavi prazna bukva
                }
            }
        }
    }
}
