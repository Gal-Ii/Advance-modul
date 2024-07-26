package f03_Set_and_Maps_Ezcersice;

import java.util.*;

public class p07_Hands_of_cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Set<String>> scoreList = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] inputArr = input.split(": ");
            String person = inputArr[0];
            String[] cardsArr = inputArr[1].split(", ");

                if(!scoreList.containsKey(person)){
                    scoreList.putIfAbsent(person, new HashSet<>());
                    scoreList.get(person).addAll(List.of(cardsArr));
                }else {
                    scoreList.get(person).addAll(List.of(cardsArr));
                }

            input = scanner.nextLine();

        }
        for (Map.Entry<String, Set<String>> entry : scoreList.entrySet()) {

            String playerName = entry.getKey();
            Set<String> cards = entry.getValue();

            int totalCardsValue = calculateTotalValue(cards);

            System.out.printf("%s: %d\n", playerName, totalCardsValue);
        }
    }

    private static int calculateTotalValue(Set<String> cards) {

        int sum = 0;
        for (String card : cards) {
            // PT
            // value = power * type
            int cardValue;
            if (card.startsWith("10")) {
                // 10H
                char cardType = card.charAt(2);
                cardValue = 10 * getNumberBySymbol(cardType);
            } else {
                // 3H
                char cardPower = card.charAt(0);
                char cardType = card.charAt(1);
                cardValue = getNumberBySymbol(cardPower) * getNumberBySymbol(cardType);
            }
            sum += cardValue;
        }
        return sum;
    }

    private static int getNumberBySymbol(char symbol) {

        int number = 0;

        switch (symbol) {
            case '2' -> number = 2;
            case '3' -> number = 3;
            case '4' -> number = 4;
            case '5' -> number = 5;
            case '6' -> number = 6;
            case '7' -> number = 7;
            case '8' -> number = 8;
            case '9' -> number = 9;
            case 'J' -> number = 11;
            case 'Q' -> number = 12;
            case 'K' -> number = 13;
            case 'A' -> number = 14;
            case 'S' -> number = 4;
            case 'H' -> number = 3;
            case 'D' -> number = 2;
            case 'C' -> number = 1;
        }

        return number;
    }
}
