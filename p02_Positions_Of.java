package f02_Multidimentional_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p02_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner);

        int rows = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[rows][col];

        for (int r = 0; r < rows; r++) {
            int[] currentArr = readArray(scanner);

            matrix[r] = currentArr;
        }

        ArrayList<String> output = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < matrix.length; i++) {
            int[] arrFromMatrix = matrix[i];

            for (int j = 0; j < arrFromMatrix.length; j++) {
                int currentNumber = arrFromMatrix[j];

                if (currentNumber == number) {
                    output.add(i + " " + j);
                }
            }
        }
        if (output.isEmpty()) {
            output.add("not found");
        }

        System.out.println(String.join(System.lineSeparator(), output));
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
