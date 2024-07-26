package f05_Funtional_Programming_Excersice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p04_Applied_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        String input = scanner.nextLine();

        Function<List<Integer>, List<Integer>> addFunction =
                listOfNumbers -> listOfNumbers.stream()
                        .map(number -> number + 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyFunction =
                listOfNumbers -> listOfNumbers.stream()
                        .map(number -> number * 2).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtractFunction =
                listOfNumbers -> listOfNumbers.stream()
                        .map(number -> number - 1).collect(Collectors.toList());



        while (!input.equals("end")){

            switch (input){
                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractFunction.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;

            }

            input = scanner.nextLine();
        }

    }
}
