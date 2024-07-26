package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p05_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divisible = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> mapNumbers = n -> n % divisible == 0;

        numbers.removeIf(mapNumbers);

        numbers.forEach(e -> System.out.print(e + " "));

    }
}
