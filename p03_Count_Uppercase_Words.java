package f05_Functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class p03_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Predicate<String> startsWithUppercase = s -> Character.isUpperCase(s.charAt(0));

        List<String> list = Arrays.stream(text.split("\\s+"))
                .filter(startsWithUppercase)
                .toList();

        System.out.println(list.size());

        Consumer<String> printer = e -> System.out.println(e);

        list.forEach(printer);
    }
}
