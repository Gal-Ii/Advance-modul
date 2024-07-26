package f06_Defining_Classes;

import java.util.Scanner;

public class p01_MainCar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- >0){

            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];

            p01_Car car;
         if (data.length == 1){
             car = new p01_Car(brand);
         }else{
             String model = data[1];
             int horsePower = Integer.parseInt(data[2]);

             car = new p01_Car(brand, model, horsePower);
         }

            System.out.println(car.getInfo());
        }


    }
}
