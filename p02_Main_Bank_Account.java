package f06_Defining_Classes.Bank_account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02_Main_Bank_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, p02_BankAccount> bank = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            String output = "";
            if (command.equals("Create")) {
                p02_BankAccount account = new p02_BankAccount();
                bank.put(account.getId(), account);
                output = "Account ID" + account.getId() + "created";
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                double amount = Double.parseDouble(tokens[2]);
                
            }


            input = scanner.nextLine();
        }

    }
}
