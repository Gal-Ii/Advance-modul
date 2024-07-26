package f03_Set_and_Maps_Ezcersice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p01_Unique_usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        while (num-- >0){
            String username = scanner.nextLine();

            usernames.add(username);
        }

        for (String user:usernames) {
            System.out.println(user);
        }
    }
}
