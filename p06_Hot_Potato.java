package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p06_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int toss = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child : children)
            queue.offer(child);

        while (queue.size() > 1) {
            for (int i = 1; i < toss; i++)
                queue.offer(queue.poll());
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());

    }

}