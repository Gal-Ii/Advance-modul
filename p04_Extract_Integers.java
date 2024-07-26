package f04_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class p04_Extract_Integers {
    public static void main(String[] args)throws IOException {
        String path = "D:\\Java-Advance modul\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        while (scanner.hasNext()){
            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                writer.println(number);
            }else {
                scanner.next();
            }
        }
writer.flush();

    }
}
