package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p06_Predicate_for_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLetters = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> checkNames = n -> n.length() <= numberOfLetters;

        names.stream()
                .filter(checkNames)
                .forEach(e -> System.out.println(e));

    }

}
