package f06_Defining_Classes.Car_Salesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] enginInformation = scanner.nextLine().split("\\s+");
//            model, power, displacement, and efficiency
            String model = enginInformation[0];
            int power = Integer.parseInt(enginInformation[1]);
            String displacement = "n/a";
            String efficiency = "n/a";

            if (enginInformation.length == 4) {
                displacement = enginInformation[2];
                efficiency = enginInformation[3];
            }

            if (enginInformation.length == 3) {
                if (Character.isDigit(enginInformation[2].charAt(0))) {
                    displacement = enginInformation[2];
                } else {
                    efficiency = enginInformation[2];
                }
            }
            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCars; i++) {
            String[] infoCars = scanner.nextLine().split("\\s+");
//            "{Model} {Engine} {Weight} {Color}",
            String model = infoCars[0];
            String engineName = infoCars[1];
            String weight = "n/a";
            String color = "n/a";

            if (infoCars.length == 4) {
                weight = infoCars[2];
                color = infoCars[3];
            }

            if (infoCars.length == 3) {
                if (Character.isDigit(infoCars[2].charAt(0))) {
                    weight = infoCars[2];
                } else {
                    color = infoCars[2];
                }
            }

            Engine engine = getEngineByModel(engines, engineName);
            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        }

    }

    private static Engine getEngineByModel(List<Engine> engines, String engineName) {
        for (Engine engin : engines) {
            if(engin.getModel().equals(engineName)){
                return engin;
            }
        }
        return null;
    }
}
