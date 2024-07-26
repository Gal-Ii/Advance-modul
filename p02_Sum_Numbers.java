package f05_Functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p02_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();
        System.out.println("Count = " + list.size());
        System.out.println("Sum = " +
                list.stream()
                        .mapToInt(e -> e)
                        .sum()
                );
    }
}
