package f01_Stack_and_Queue_Excersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p03_Maximum_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] commands = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (commands[0]){
                case 1 -> stack.push(commands[1]);
                case 2 -> stack.pop();
                case 3 -> System.out.println(Collections.max(stack));
            }

        }
    }
}
