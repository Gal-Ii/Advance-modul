package f03_Set_and_Maps_Ezcersice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class p02_Sets_of_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstSet = input[0];
        int secondSet = input[1];

        LinkedHashSet<Integer> firstS = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondS = new LinkedHashSet<>();

        for (int i = 0; i < firstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstS.add(number);
        }

        for (int i = 0; i < secondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondS.add(number);
        }

        System.out.println();
        for (int f:firstS) {
            int firstSetNumber = f;

            for (int s:secondS) {
                int secondSetNumber = s;

                if (firstSetNumber == secondSetNumber){
                    System.out.print(firstSetNumber + " ");
                }
            }
        }

    }

}
