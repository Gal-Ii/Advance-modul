package f03_Sets_and_Maps;

import java.util.*;
import java.util.stream.Collectors;

public class p07_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continents = new LinkedHashMap<>();


        while (num-- >0){

            String[] commands = scanner.nextLine().split(" ");

            String continent = commands[0];
            String country = commands[1];
            String city = commands[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
           LinkedHashMap<String, ArrayList<String>> countries =continents.get(continent);
           countries.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countries.get(country);
            cities.add(city);
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : continents.entrySet()) {
            System.out.println(entry.getKey() + ":");

            for (var innerEntry:entry.getValue().entrySet()) {
                String country = innerEntry.getKey();
                String cities = String.join(", ",innerEntry.getValue());

                System.out.printf("%s -> %s\n", country, cities);
            }
        }
    }
}
