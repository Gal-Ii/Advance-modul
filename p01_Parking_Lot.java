package f03_Sets_and_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class p01_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();


        while (!input.equalsIgnoreCase("END")){
            String registrationNum = input.substring(input.lastIndexOf(" ")).trim();

            if(input.contains("IN")){
            parkingLot.add(registrationNum);
            }else {
                parkingLot.remove(registrationNum);
            }

            input = scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String str: parkingLot) {
                System.out.println(str);
            }
        }
    }
}
