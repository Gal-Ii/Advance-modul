package f01_Stack_and_Queue_Excersice;

import java.util.*;

public class p02_Basic_stack_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.offer(number);
        }

        for (int i = 0; i < s; i++) {
            numbers.poll();
        }

        if(numbers.isEmpty()){
            System.out.println(0);
        } else if (numbers.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numbers));
        }
    }
}
