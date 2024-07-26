package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p04_Matching_brackts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if(current == '('){
                indexes.push(i);
            }else if(current == ')'){
                int begin = indexes.pop();
                int end = i + 1;
                String sunExpression = expression.substring(begin, end);
                System.out.println(sunExpression);
            }
        }
    }
}
