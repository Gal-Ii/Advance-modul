package f05_Functional_programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class p04_Add_Vat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");

       DoubleUnaryOperator addVat = e -> e * 1.2;

       Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(addVat)
                .forEach(f -> System.out.printf("%.2f\n", f));


    }
}
