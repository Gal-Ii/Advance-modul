package f06_Defining_Classes.Raw_Data;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Car>> carsByCargoType = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("\\s+");
            String model = inputArr[0];
            int engineSpeed = Integer.parseInt(inputArr[1]);
            int enginePower = Integer.parseInt(inputArr[2]);
            int cargoWeight = Integer.parseInt(inputArr[3]);
            String cargoType = inputArr[4];
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tires> tires = new ArrayList<>();
            for (int j = 5; j <= 12; j += 2) {
                Tires currentTire = new Tires(Double.parseDouble(inputArr[j]), Integer.parseInt(inputArr[j + 1]));
                tires.add(currentTire);
            }
            Car currentCar = new Car(model, engine, cargo, tires);
            carsByCargoType.putIfAbsent(cargoType, new ArrayList<>());
            carsByCargoType.get(cargoType).add(currentCar);
        }

        String command = scanner.nextLine();

        carsByCargoType.get(command).forEach(car -> car.extract(command));
    }
}
