package f02_MA_exam_tasks;

import java.util.Scanner;

public class Escape_the_Maze {

    private static boolean escapeTheMaze = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        fillMatrix(scanner, matrix);

        int[] myCoordinates = findMyPosition(matrix);
        int myRow = myCoordinates[0];
        int myCol = myCoordinates[1];

        int health = 100;

        String commands = scanner.nextLine();

        while (matrix[myRow][myCol] != 'X') {
            matrix[myRow][myCol] = '-';

            switch (commands) {
                case "up" -> myRow--;
                case "down" -> myRow++;
                case "left" -> myCol--;
                case "right" -> myCol++;
            }

            if (myRow < 0 || myRow > matrix.length - 1 || myCol < 0 || myCol > matrix.length - 1) {
                switch (commands) {
                    case "up" -> myRow++;
                    case "down" -> myRow--;
                    case "left" -> myCol++;
                    case "right" -> myCol--;
                }
            }

            if (matrix[myRow][myCol] == 'M') {
                health -= 40;
                matrix[myRow][myCol] = '-';
                if (health <= 0) {
                    health = 0;
                    matrix[myRow][myCol] = 'P';
                    System.out.println("Player is dead. Maze over!");
                    System.out.printf("Player's health: %d units\n", health);
                    printMatrix(matrix);
                    break;
                }
            }

            if (matrix[myRow][myCol] == 'H') {
                health += 15;
                matrix[myRow][myCol] = '-';
                if (health > 100) {
                    health = 100;
                }

            }

            if (matrix[myRow][myCol] == 'X' && health > 0) {
                matrix[myRow][myCol] = 'P';
                System.out.println("Player escaped the maze. Danger passed!");
                System.out.printf("Player's health: %d units\n", health);
                printMatrix(matrix);
                break;
            }
            matrix[myRow][myCol] = 'P';
            commands = scanner.nextLine();
        }

    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] findMyPosition(char[][] matrix) {
        int[] myCoordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    myCoordinates[0] = row;
                    myCoordinates[1] = col;
                }
            }
        }
        return myCoordinates;
    }

    private static void fillMatrix(Scanner scanner, char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().toCharArray();
        }
    }
}