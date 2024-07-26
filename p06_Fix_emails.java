package f03_Set_and_Maps_Ezcersice;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class p06_Fix_emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        LinkedHashMap<String, String> phoneContacts = new LinkedHashMap<>();
        String userName = scanner.nextLine();

        while (!userName.contains("stop")) {
            String email = scanner.nextLine();


            if((!email.endsWith("us"))&&(!email.endsWith("uk"))&&(!email.endsWith("com"))){
                System.out.printf("%s -> %s\n", userName, email);
            }
            userName = scanner.nextLine();
        }

    }
}
