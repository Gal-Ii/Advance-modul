package f03_Sets_and_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> students = new TreeMap<>();

        double avg = 0;

        while (num -- > 0){
            String student = scanner.nextLine();
            double grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0);

            students.putIfAbsent(student, grades);

        }

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            String student = entry.getKey();
            double avgScore = entry.getValue();

            System.out.printf("%s is graduated with %s\n", student, avgScore);
        }
    }
}
