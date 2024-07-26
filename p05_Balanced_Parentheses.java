package f01_Stack_and_Queue_Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String input = scanner.nextLine();

        for (char parenthesis : input.toCharArray()) {
            if( parenthesis == '{' || parenthesis == '[' || parenthesis == '(' ){
                stack.push(parenthesis);
            }else {
               if(stack.isEmpty() || !areMatchingParentheses (stack.pop(), parenthesis)){
                   System.out.println("NO");
                   return;
               }
            }
        }
        System.out.println("YES");
    }

    public static boolean areMatchingParentheses (char openParentheses, char closedParentheses){
        if(openParentheses == '{'){
            return closedParentheses == '}';
        } else if (openParentheses == '[') {
            return closedParentheses == ']';
        }else {
            return closedParentheses == ')';
        }
    }
}
