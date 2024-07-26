package f01_Stack_and_Queue_Excersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p01_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numberArr.length; i++) {
            numbers.push(numberArr[i]);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
