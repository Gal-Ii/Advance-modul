package f02_Multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p03_Intersection_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[arr][col];
        String[][] secondMatrix = new String[arr][col];

       for (int i = 0; i < arr; i++) {
           firstMatrix[i] = getArray(scanner);
        }

       for (int i = 0; i < arr; i++) {
            secondMatrix[i] = getArray(scanner);
        }

        int i=0;
        while (i< firstMatrix.length){
            String[] arrFirstMatrix = firstMatrix[i];
            String[] arrSecondMatrix = secondMatrix[i];

            int j = 0;
            while (j< arrFirstMatrix.length){
                if (arrFirstMatrix[j].equals(arrSecondMatrix[j])){
                    System.out.print(arrFirstMatrix[j] + " ");
                }else {
                    System.out.print("*" + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    private static String[] getArray(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }
}