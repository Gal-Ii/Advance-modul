package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p03_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> reminder = new ArrayDeque<>();

        if(number==0){
            System.out.print(0);
        }

        while (number!=0){
            int binary = number % 2;
            reminder.push(binary);
            number /= 2;
        }

        while (!reminder.isEmpty()){
            System.out.print(reminder.pop());
        }

    }
}
