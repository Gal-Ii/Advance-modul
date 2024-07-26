package f01_Stack_and_Queue_Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p07_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();
        ArrayDeque<String> textHistory = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            switch (inputArr[0]) {
                case "1":
                    textHistory.push(builder.toString()); // преди да добавим нещо запазваме предишното състояние на стрингБилдъра
                    builder.append(inputArr[1]);
                    break;
                case "2":
                    textHistory.push(builder.toString()); // преди да добавим нещо запазваме предишното състояние на стрингБилдъра
                    int countToBeDeleted = Integer.parseInt(inputArr[1]); //колко символа трябва да се изтрият
                    int startDeletingPosition = builder.length() - countToBeDeleted;  //от кой индекс да стартирам с триенето
                    builder.delete(startDeletingPosition, builder.length()); //трия - стсртова позизия за триене, края ще е последния символ в билдъра
                    break;
                case "3":
                    int index = Integer.parseInt(inputArr[1]) - 1;
                    System.out.println(builder.charAt(index));
                    break;
                case "4":
                    builder = new StringBuilder(textHistory.pop());
                    break;
            }
        }


    }
}
