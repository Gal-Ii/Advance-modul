package f01_Stack_and_Queue_Exam_tasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Energy_Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(stack::push);
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(queue::offer);

        int caffeineLimit = 300;
        int stamatsCoffee = 0;

        while (!stack.isEmpty() && !queue.isEmpty()){
            int milligramsCaffeine = stack.pop();
            int energyDrinks = queue.poll();
            int caffeine = milligramsCaffeine * energyDrinks;

            if(stamatsCoffee + caffeine <= caffeineLimit){
                stamatsCoffee += caffeine;
            }else {
                queue.offer(energyDrinks);
                if (stamatsCoffee > 0) {
                  stamatsCoffee -= 30;
                }
            }

        }

        if(!queue.isEmpty()){
            String output = queue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Drinks left: " + output);
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", stamatsCoffee);


    }
}
