package f02_MA_exam_tasks;

import java.util.Scanner;

public class The_Gamebler {
    private static int money = 100;
    private static boolean isJackPorWined = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        int row = 0;
        int col = 0;
        for (int r = 0; r < n; r++) {
            String input = scanner.nextLine();
            matrix[r] = input.toCharArray();

            if (input.contains("G")) {
                row = r;
                col = input.indexOf("G");
            }
        }

        String command = scanner.nextLine();


        while (!command.equals("end") && money>0 && !isJackPorWined) {
            if (command.equals("up")) {
                movePlayer(row, col, row-1, col, matrix);
                row--;
            } else if (command.equals("down")) {
                movePlayer(row, col, row+1, col, matrix);
                row++;
            } else if (command.equals("left")) {
                movePlayer(row, col, row, col-1, matrix);
                col--;
            } else if (command.equals("right")) {
                movePlayer(row, col, row, col+1, matrix);
                col++;
            }

            command = scanner.nextLine();
        }

        if(money<=0){
            System.out.println("Game over! You lost everything!");
        }else {
            if(isJackPorWined){
                System.out.println("You win the Jackpot!");
            }
            System.out.println("End of the game. Total amount: " + money + "$");
            printMatrix(matrix);
        }
    }



    private static void movePlayer(int row, int col, int nextRow, int nextCol,  char[][] matrix) {

        if (!isInBounds(nextRow, nextCol, matrix)) {
            money = -1;
            return;
        }

        char nextPosSymbol = matrix[nextRow][nextCol];
        if (nextPosSymbol == 'W') {
            money += 100;
        } else if (nextPosSymbol == 'P') {
            money -= 200;
        } else if (nextPosSymbol == 'J') {
            money += 100000;
            isJackPorWined = true;

        }
        matrix[row][col] = '-';
        matrix[nextRow][nextCol] = 'G';

//        char nextPosSymbol = matrix[nextRow][col];
//        money += amountToAdd(nextPosSymbol);

    }

    public static int amountToAdd(char symbol) {
        return switch (symbol) {
            case 'W' -> 100;
            case 'P' -> -200;
            case 'J' -> 100000;
            default -> 0;
        };
    }

    public static boolean isInBounds(int r, int c, char[][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static void printMatrix(char[][]matrix){
        for (char[] chars:matrix) {
            for (char c:chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
