package f03_Sets_and_Maps;

import java.util.*;

public class p06_Product_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        while (!input.contains("Revision")){
            String[] foodShops = input.split(", ");
            String shop = foodShops[0];
            String food = foodShops[1];
            double price = Double.parseDouble(foodShops[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> product = shops.get(shop);
            product.putIfAbsent(food, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shops.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (var innerEntry:entry.getValue().entrySet()) {
                String food = innerEntry.getKey();
                double price = innerEntry.getValue();

                System.out.printf("Product: %s, Price: %.1f\n", food, price);
            }
        }
    }
}
