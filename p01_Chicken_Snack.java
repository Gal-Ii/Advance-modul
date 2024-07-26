package f01_Stack_and_Queue_Exam_tasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p01_Chicken_Snack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] money = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] price = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> moneyDeque = new ArrayDeque<>();
        ArrayDeque<Integer> priceDeque = new ArrayDeque<>();

        for (int i = 0; i < money.length; i++) {
            moneyDeque.push(money[i]);
        }

        for (int i = 0; i < price.length; i++) {
            priceDeque.offer(price[i]);
        }
int counter = 0;
        while (!moneyDeque.isEmpty() || !priceDeque.isEmpty()){
            if(moneyDeque.isEmpty() || priceDeque.isEmpty()){
                break;
            }

            int currentMoney = moneyDeque.peek();
            int priceOfFood = priceDeque.peek();


            if(currentMoney == priceOfFood){
                moneyDeque.pop();
                priceDeque.poll();
                counter++;
            } else if (currentMoney > priceOfFood) {

                int change = currentMoney - priceOfFood;
                moneyDeque.pop();
                priceDeque.poll();

                int newSum = moneyDeque.pop() + change;
                moneyDeque.push(newSum);
                counter++;
            } else{
                moneyDeque.pop();
                priceDeque.poll();
            }
        }

        if(counter>=4){
            System.out.printf("Gluttony of the day! Henry ate %d foods.", counter);
        } else if (counter>1) {
            System.out.printf("Henry ate: %d foods.", counter);
        } else if (counter==1) {
            System.out.printf("Henry ate: %d food.", counter);
        }else {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }
    }
}
