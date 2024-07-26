package f05_Funtional_Programming_Excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p09_List_of_predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        List<Predicate<Integer>> predicate = new ArrayList<>();

        for (Integer div:divisors) {
            Predicate<Integer> pred = number -> number % div == 0;
            predicate.add(pred);
        }

        for (int i = 1; i <= n; i++) {

            boolean isDivisibleByAllPredicates = true;
            for (Predicate<Integer> p : predicate) {
                if(!p.test(i)){
                    isDivisibleByAllPredicates = false;
                }
            }

            if(isDivisibleByAllPredicates){
                System.out.print(i + " ");
            }
        }

    }
}
