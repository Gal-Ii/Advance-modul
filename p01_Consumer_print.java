package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class p01_Consumer_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(System.out::println);

// List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .toList();
//
//        names.forEach(e -> System.out.println(e));
    }
}
