package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p02_Simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Character> operator = new ArrayDeque<>();

        for (int i = 0; i < inputArr.length; i++) {
            String nums = inputArr[i];

            if (nums.equals("+") || nums.equals("-")) {
                operator.push(nums.charAt(0));
            } else {
                numbers.push(Integer.parseInt(nums));
            }
        }

        while (!numbers.isEmpty()) {
            int firstNum = numbers.pollLast();
            if(numbers.peek() == null) {
                System.out.println(firstNum);
                break;
            }
            int secondNum = 0;
            secondNum = numbers.pollLast();

            char oper = operator.pollLast();

            if (oper == '+') {
                int sum = firstNum + secondNum;
                numbers.offer(sum);
                operator.push(oper);
            }
            if(oper == '-') {
                int subtraction = Math.abs(firstNum - secondNum);
                numbers.offer(subtraction);
                operator.push(oper);
            }
        }
    }
}

