package f03_Set_and_Maps_Ezcersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, String> phoneContacts = new LinkedHashMap<>();

        String name = "";
        while (!input.contains("search")) {
            String[] contacts = input.split("-");
            name = contacts[0];
            String phoneNumber = contacts[1];

            phoneContacts.putIfAbsent(name, phoneNumber);

            input = scanner.nextLine();
        }

        String inputForCheck = scanner.nextLine();
        while (!inputForCheck.contains("stop")) {

            for (Map.Entry<String, String> entry : phoneContacts.entrySet()) {
                String nameForPrint = entry.getKey();
                String phone = entry.getValue();
                if (entry.getKey().equals(inputForCheck)) {
                    System.out.printf("%s -> %s\n", nameForPrint, phone);
                }
            }
            if(!phoneContacts.containsKey(inputForCheck)){
                System.out.printf("Contact %s does not exist.\n", inputForCheck);
            }

            inputForCheck = scanner.nextLine();
        }
    }
}
