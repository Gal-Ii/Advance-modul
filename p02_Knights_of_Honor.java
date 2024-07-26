package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p02_Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        names.stream()
                .forEach(e -> System.out.println("Sir " + e));

    }
}
