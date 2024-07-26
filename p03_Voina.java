package f03_Sets_and_Maps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = getCollect(scanner);
        LinkedHashSet<Integer> secondPlayer = getCollect(scanner);

        int rounds = 50;

        while (rounds-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstNumber = getFirstNumber(firstPlayer);
            firstPlayer.remove(firstNumber);
            int secondNumber = getFirstNumber(secondPlayer);
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }

        }

        if(firstPlayer.size() == secondPlayer.size()){
            System.out.println("Draw!");
        } else if (firstPlayer.size()> secondPlayer.size()) {
            System.out.println("First player win!");
        }else {
            System.out.println("Second player win!");
        }
    }

    private static int getFirstNumber(LinkedHashSet<Integer> firstPlayer) {

        for (Integer number : firstPlayer) {
            return number;
        }
        return 0;
    }

    private static LinkedHashSet<Integer> getCollect(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
