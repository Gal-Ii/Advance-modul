package f03_Sets_and_Maps;

import java.util.*;
import java.util.stream.Collectors;

public class p04_Count_real_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> calculation = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];

            if(!calculation.containsKey(number)){
                calculation.put(number, 1);
            }else{
                calculation.put(number, calculation.get(number)+1);
            }
        }

        for (Map.Entry<Double, Integer> entry : calculation.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
