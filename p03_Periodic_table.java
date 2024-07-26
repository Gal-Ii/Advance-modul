package f03_Set_and_Maps_Ezcersice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class p03_Periodic_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        while (num-- >0){
            String[] element = scanner.nextLine().split(" ");
            for (int i = 0; i < element.length; i++) {
                String chemical = element[i];
                elements.add(chemical);
            }
        }

        for (String e:elements) {
            System.out.print(e + " ");
        }
    }
}
