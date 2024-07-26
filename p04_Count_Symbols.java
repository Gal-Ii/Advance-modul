package f03_Set_and_Maps_Ezcersice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class p04_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            char symbol = input[i].charAt(0);

            if(!symbolMap.containsKey(symbol)){
                symbolMap.put(symbol, 1);
            }else{
                symbolMap.put(symbol, symbolMap.get(symbol)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolMap.entrySet()) {
            System.out.printf("%c: %d time/s\n", entry.getKey(), entry.getValue());
        }
    }
}
