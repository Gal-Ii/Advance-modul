package f03_Sets_and_Maps;

import java.util.*;
import java.util.stream.Collectors;

public class p05_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> studentsList = new TreeMap<>();

        while (num-- >0){

            String[] commands = scanner.nextLine().split(" ");

            String name = commands[0];
            double grade = Double.parseDouble(commands[1]);

            studentsList.putIfAbsent(name, new ArrayList<>());
            List<Double> grades = studentsList.get(name);
            grades.add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsList.entrySet()) {
            String name = entry.getKey();
//            String grades = entry.getValue().stream()
//                    .map(g->String.format("%.2f", g))
//                    .collect(Collectors.joining(" "));
//
//            double averageGrade = entry.getValue().stream()
//                    .mapToDouble(g -> g).average()
//                    .getAsDouble();
//
//            System.out.printf(String.format("%s -> %s (avg: %.2f)", name, grades, averageGrade));
//

            String grades = "";
            double sum = 0;

            for (Double grade: entry.getValue()){
                grades += String.format("%.2f ", grade);
                sum += grade;
            }

            System.out.printf(String.format("%s -> %s(avg: %.2f)", name, grades, sum / entry.getValue().size()));
            System.out.println();
        }

    }
}
