package f02_Multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p01_Compare_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = firstMatrix.length == secondMatrix.length;

        int i = 0;
        while (i < firstMatrix.length && areEqual) {
            int[] firstArr = firstMatrix[i];
            int[] secondArr = secondMatrix[i];
            areEqual = firstArr.length == secondArr.length;

            int j = 0;
            while (j < firstArr.length && areEqual) {
                areEqual = firstArr[j] == secondArr[j];
                j++;
            }
            i++;
        }
        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    public static int[][] readMatrix(Scanner scanner) {
        int[] dimensions = readArr(scanner);

        int arr = dimensions[0];
        int elementsOfArr = dimensions[1];

        int[][] matrix = new int[arr][elementsOfArr];

        for (int i = 0; i < arr; i++) {
            matrix[i] = readArr(scanner);
        }

        return matrix;
    }

    public static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
