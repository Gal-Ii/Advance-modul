package f01_Stack_and_Queue_Exam_tasks;

import java.util.*;

public class Offroad_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fuel = getArray(scanner);
        int[] consumptionIndex = getArray(scanner);
        int[] amountOfFuelNeeded = getArray(scanner);

        ArrayDeque<Integer> fuelDeque = new ArrayDeque<>();
        ArrayDeque<Integer> consumption = new ArrayDeque<>();
        ArrayDeque<Integer> amount = new ArrayDeque<>();

        for (int i = 0; i < fuel.length; i++) {
            fuelDeque.push(fuel[i]);
        }

        for (int i = 0; i < consumptionIndex.length; i++) {
            consumption.offer(consumptionIndex[i]);
        }

        for (int i = 0; i < amountOfFuelNeeded.length; i++) {
            amount.offer(amountOfFuelNeeded[i]);
        }

        int counter = 0;
        List<String> reached = new ArrayList<>();

        while (!fuelDeque.isEmpty()) {
            int fuelToCheck = fuelDeque.peek();
            int consumptionToCheck = consumption.peek();
            int subtract = fuelToCheck - consumptionToCheck;
            int ammountToChack = amount.peek();


            if (subtract >= ammountToChack) {
                fuelDeque.pop();
                consumption.poll();
                amount.poll();
                counter++;
                System.out.printf("John has reached: Altitude %d\n", counter);
                String altitude = "Altitude " + counter;
                reached.add(altitude);
            } else {
                counter++;
                System.out.printf("John did not reach: Altitude %d\n", counter);
                break;
            }
        }

        if (amount.isEmpty()) {
            System.out.println("John has reached all the altitudes and managed to reach the top!\n");

        }else{
            System.out.println("John failed to reach the top.");
            if (!reached.isEmpty()) {
                System.out.print("Reached altitudes: ");
            } else {
                System.out.println("John didn't reach any altitude.");
            }

            System.out.print(String.join(", ", reached));
        }

    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
