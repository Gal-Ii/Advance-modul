package f05_Functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01_Sort_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .toList();

        System.out.println(convertToString(evenNumbers));

        List<Integer> collectedNumbers = evenNumbers.stream().sorted().toList();

        System.out.println(convertToString(collectedNumbers));
    }

    public  static String convertToString (List<Integer> number){
        return  number.stream().map(i -> String.valueOf(i))
                .collect(Collectors.joining(", "));
    }
}
