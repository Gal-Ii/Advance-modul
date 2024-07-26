package f02_Multidimentional_arrays_Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class p05_Matrix_Shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = input[0];
        int cols = input[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] commandsArr = command.split(" ");

            if (commandsArr.length != 5) {
                System.out.println("Invalid input!");
            }else{
                String commandToDo = commandsArr[0];
                int row1 = Integer.parseInt(commandsArr[1]);
                int col1 = Integer.parseInt(commandsArr[2]);
                int row2 = Integer.parseInt(commandsArr[3]);
                int col2 = Integer.parseInt(commandsArr[4]);

                if (row1 > rows || row2 > rows || col1 > cols || col2 > cols || !commandToDo.equals("swap")) {
                    System.out.println("Invalid input!");
                } else {

                    for (int row = 0; row < matrix.length; row++)

                        for (int col = 0; col < matrix[row].length; col++) {
                            String element = matrix[row][col];
                            String changedElement = matrix[row2][col2];

                            if (row == row1 && col == col1) {

                                matrix[row][col] = changedElement;
                                matrix[row2][col2] = element;
                                printMatrix(matrix);
                                break;
                            }
                        }
                }
            }
            command = scanner.nextLine();
        }
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
