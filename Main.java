package f06_Defining_Classes.Speed_Rasing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            double fuel = Double.parseDouble(input[1]);
            double fuelCostPerKm = Double.parseDouble(input[2]);

            Car car = new Car(model,fuel, fuelCostPerKm);
            cars.add(car);
        }

        String commandInput = scanner.nextLine();
        while (!commandInput.contains("End")){
            String[] commandToBeDone = commandInput.split("\\s+");
            String command = commandToBeDone[0];
            String model = commandToBeDone[1];
            int kmToTravel = Integer.parseInt(commandToBeDone[2]);

            Car car = getCarByModel(cars, model);
            car.drive(kmToTravel);
            commandInput = scanner.nextLine();
        }

cars.forEach(car -> System.out.println(car));
    }

    private static Car getCarByModel(List<Car> cars, String model) {

        for (Car car : cars) {
            if(car.getModel().equals(model)){
                return car;
            }
        }

        return null;
    }
}
