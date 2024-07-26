package f06_Defining_Classes.Raw_Data;

import java.util.ArrayList;
import java.util.List;

public class Car {
//    model, engine, cargo, and a collection of exactly 4 tires
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tires> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public void extract(String command) {
        switch (command) {
            case "fragile":
                for (Tires tire : tires) {
                    double pressure = tire.getPressure();
                    if (pressure < 1) {
                        System.out.println(model);
                        break;
                    }
                }
                break;
            case "flamable":
                if (engine.getPower() > 250) {
                    System.out.println(model);
                }
                break;
        }
    }
}
