package f02_MA_exam_tasks;

import java.util.Scanner;

public class Clear_Skies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        fillMatrix(scanner, matrix);

        int[] myCoordinates = findMyPosition(matrix);
        int myRow = myCoordinates[0];
        int myCol = myCoordinates[1];

        int armour = 300;

        String commands = scanner.nextLine();
        int fights = 0;
        while (true){
            matrix[myRow][myCol] = '-';

            switch (commands){
                case "up" -> myRow--;
                case "down" -> myRow++;
                case "left" -> myCol--;
                case "right" -> myCol++;
            }

            if(matrix[myRow][myCol] == 'E'){
                armour -= 100;
                matrix[myRow][myCol] = '-';
                fights++;
            } else if (matrix[myRow][myCol] == 'R') {
                armour = 300;
                matrix[myRow][myCol] = '-';
            }

            matrix[myRow][myCol] = 'J';
            if(fights==3 && armour<=100){

                System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!\n", myRow, myCol);
                break;
            } else if (fights==4){

                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                break;
            }
            matrix[myRow][myCol] = 'J';
            commands = scanner.nextLine();
        }

printMatrix(matrix);
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
                if(matrix[row][col] == 'J'){
                    myCoordinates[0] = row;
                    myCoordinates[1] = col;
                }
            }
        }
        return myCoordinates;
    }

    private static void fillMatrix(Scanner scanner, char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col];
            }
        }
    }
}
