package f03_Sets_and_Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p09_Largest_3_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        System.out.println();

        for (int i=0; i<numbers.size(); i++) {
            int maxNumber = numbers.get(i);

            if(i<=2){
                System.out.print(maxNumber + " ");
            }

        }



    }
}
