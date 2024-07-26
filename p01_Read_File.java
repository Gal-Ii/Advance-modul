package f04_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class p01_Read_File {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java-Advance modul\\04. Java-Advanced-Files-and-Streams-Lab-Resources";

        FileInputStream inputStream = new FileInputStream(path);

        int asciiCode = inputStream.read();

        while (asciiCode != -1){
            System.out.print(Integer.toBinaryString(asciiCode) + " ");
            asciiCode = inputStream.read();
        }

//        try {
//            FileInputStream inputStream = new FileInputStream(path);
//            System.out.println("File is open for reading!");
//        } catch (FileNotFoundException exception){
//            System.out.println("File is not found!" + path);
//            return;
//        }finally {
//            System.out.println("I am always executed");
//        }

//        Scanner scanner = new Scanner(path);
//
//        String input = scanner.nextLine();
//
//        while (!input.equals("END")){
//
//            for (int i = 0; i < input.length(); i++) {
//                char symbol = input.charAt(i);
//
//                System.out.print(Integer.toBinaryString(symbol) + " ");
//
//            }
//            System.out.println();
//
////            input = scanner.nextLine();
//        }
    }
}
