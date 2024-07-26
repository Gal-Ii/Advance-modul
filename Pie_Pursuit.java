package f01_Stack_and_Queue_Exam_tasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Pie_Pursuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> contestantDeque = new ArrayDeque<>();
        fillArrayDeque(scanner, contestantDeque::offer);

        ArrayDeque<Integer> piecesDeque = new ArrayDeque<>();
        fillArrayDeque(scanner, piecesDeque::push);

        while (!contestantDeque.isEmpty() || !piecesDeque.isEmpty()) {
            if (contestantDeque.isEmpty() || piecesDeque.isEmpty()) {
                break;
            }

            int contestant = contestantDeque.peek();
            int pieces = piecesDeque.peek();
            int eating = contestant - pieces;

            if (contestant == 0) {
                contestantDeque.poll();
            } else if (contestant > pieces) {
                contestantDeque.poll();
                contestantDeque.offer(eating);
                piecesDeque.pop();
            } else if (contestant < pieces) {
                contestantDeque.poll();
                piecesDeque.pop();
                piecesDeque.push(Math.abs(eating));
            } else {
                contestantDeque.poll();
                piecesDeque.pop();
            }

            if (!contestantDeque.isEmpty() && piecesDeque.isEmpty()) {
                System.out.println("We will have to wait for more pies to be baked!");
                System.out.print("Contestants left: ");
                System.out.print(String.join(", ", contestantDeque.toString().replace("[", "").replace("]", "")));
            } else if (contestantDeque.isEmpty() && piecesDeque.isEmpty()) {
                System.out.println("We have a champion!");
            } else if (contestantDeque.isEmpty()) {
                System.out.println("Our contestants need to rest!");
                System.out.print("Pies left: ");
                System.out.print(String.join(", ", piecesDeque.toString().replace("[", "").replace("]", "")));
            }
        }
    }

    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(insertion);
    }
}
