package f03_Sets_and_Maps;

import java.util.Scanner;
import java.util.TreeSet;

public class p02_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> reservations = new TreeSet<>();


        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {

            if (Character.isDigit(input.charAt(0))) {
                reservations.add(input);
            }


            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {

            String reservation = input;
            reservations.add(input);

            input = scanner.nextLine();
        }
        System.out.println(reservations.size());


        for (String reservation:reservations) {
            System.out.println(reservation);
        }

    }
}
