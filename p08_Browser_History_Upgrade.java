package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p08_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> listOfUrl = new ArrayDeque<>();
        ArrayDeque<String> moveForward = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                int size = listOfUrl.size();
                if (size < 1) {
                    System.out.println("no previous URLs");
                } else {
                    moveForward.offerFirst(listOfUrl.peek());
                    listOfUrl.pop();
                    System.out.println(listOfUrl.peek());
                    listOfUrl.push(moveForward.peek());
                }

            } else if (input.equals("forward")) {

                if (!moveForward.isEmpty()) {
                    System.out.println(moveForward.pop());
                    moveForward.clear();
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                listOfUrl.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }
    }
}
