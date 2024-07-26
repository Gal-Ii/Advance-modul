package f01_Stack_and_Queue_Exam_tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Worms_Holes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> warmsDeque = new ArrayDeque<>();
        ArrayDeque<Integer> holsDeque = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(warmsDeque::push);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(holsDeque::offer);

        int warmSize = warmsDeque.size();

        int counter = 0;
        while (!warmsDeque.isEmpty() && !holsDeque.isEmpty()) {
            int warms = warmsDeque.pop();
            int hols = holsDeque.poll();

            if(warms == hols){
                counter++;
            } else{
                warms-=3;
                if (warms > 0){
                    warmsDeque.push(warms);
                }
            }
        }

        if(counter>0){
            System.out.println("Matches: " + counter);
        }else {
            System.out.println("There are no matches.");
        }

        int fit = warmSize - counter;
        if (warmsDeque.isEmpty() && warmSize == counter ) {
            System.out.println("Every worm found a suitable hole!");
        } else if (warmsDeque.isEmpty() && warmSize>counter ) {
            System.out.println("Worms left: none");
        } else if (!warmsDeque.isEmpty()) {
            List<Integer> reversedWarmsDeque = new ArrayList<>(warmsDeque);
            Collections.reverse(reversedWarmsDeque);
            String output = reversedWarmsDeque.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Worms left: " + output);
        }

        if(holsDeque.isEmpty()){
            System.out.println("Holes left: none");
        }else {
            String output = holsDeque.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Holes left: " + output);
        }

    }
}
