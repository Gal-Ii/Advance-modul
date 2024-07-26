package f01_Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p01_Browser_history {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> listOfUrl = new ArrayDeque<>();

        while (!input.equals("Home")){

            if(!input.equals("back")){
                listOfUrl.push(input);
                System.out.println(input);
            } else {
                int size = listOfUrl.size();
                if(size<=1){
                    System.out.println("no previous URLs");
                }else {
                   listOfUrl.pop();
                    System.out.println(listOfUrl.peek());
                }

            }

            input = scanner.nextLine();
        }

    }
}
