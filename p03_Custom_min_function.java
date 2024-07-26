package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p03_Custom_min_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        Function<List<Integer>, Integer> minNumber = listOfNumbers -> Collections.min(listOfNumbers);

        Integer minValue = minNumber.apply(numbers);

        System.out.println(minValue);
    }
}
