package f02_MA_exam_tasks;

import java.util.Scanner;

public class Throne_Conquering {
    public static  boolean isPariseDie = false;
    public static  boolean isHelenSaved = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parisEnergy = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        if(parisEnergy<=0){
            isPariseDie = true;
        }

        char[][] matrix = new char[n][n];
        fillMatrix(scanner, matrix);

        int[] myCoordinates = findMyPosition(matrix);
        int myRow = myCoordinates[0];
        int myCol = myCoordinates[1];

        int enemyRowCoordinates;
        int enemyColCoordinates;

        while (!isPariseDie || !isHelenSaved){
            String[] commandsArr = scanner.nextLine().split("\\s+");
            String direction = commandsArr[0];
            enemyRowCoordinates = Integer.parseInt(commandsArr[1]);
            enemyColCoordinates = Integer.parseInt(commandsArr[2]);

            matrix[enemyRowCoordinates][enemyColCoordinates] = 'S';

            if (!(myRow < 0 || myRow > matrix.length - 1 || myCol < 0 || myCol > matrix.length - 1)) {
                parisEnergy -= 1;
                matrix[myRow][myCol] = '-';
                switch (direction) {
                    case "up" -> myRow--;
                    case "down" -> myRow++;
                    case "left" -> myCol--;
                    case "right" -> myCol++;
                }

                if (myRow < 0 || myRow > matrix.length - 1 || myCol < 0 || myCol > matrix.length - 1) {

                    switch (direction) {
                        case "up" -> myRow++;
                        case "down" -> myRow--;
                        case "left" -> myCol++;
                        case "right" -> myCol--;
                    }

                }
            }

            if(matrix[myRow][myCol] == matrix[enemyRowCoordinates][enemyColCoordinates]){
                parisEnergy -=2;
            }

            if(parisEnergy<=0){
                isPariseDie = true;
                matrix[myRow][myCol] = 'X';
                System.out.printf("Paris died at %d;%d.\n", myRow, myCol);
                printMatrix(matrix);
                break;
            }

            if(matrix[myRow][myCol] == 'H'){
                isHelenSaved = true;
                matrix[myRow][myCol] = '-';
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", parisEnergy);
                printMatrix(matrix);
                break;
            }
            matrix[myRow][myCol] = 'P';
            System.out.println();
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
                if(matrix[row][col] == 'P'){
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
