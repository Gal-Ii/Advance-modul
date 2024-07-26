package f02_Multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner);

        int arr = input[0];
        int elements = input[1];

        int arrCounter = 0;
        int elementPerArr = 0;
        int sum = 0;

        int[][] matrix = new int[arr][elements];

        for (int i = 0; i < arr; i++) {
            matrix[i] = readArray(scanner);
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] currentArr = matrix[i];

            for (int j = 0; j < matrix[i].length; j++) {
                int number = currentArr[j];
                sum += number;

                elementPerArr++;
            }

            arrCounter++;
        }
        System.out.println(arrCounter);
        System.out.println(elementPerArr/arrCounter);
        System.out.println(sum);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
