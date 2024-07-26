package f06_Defining_Classes.Car_Salesman;

public class Car {
//    model, engine, weight, and color
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

public String toString(){
//        "{CarModel}:
//{EngineModel}:
//Power: {EnginePower}
//Displacement: {EngineDisplacement}
//Efficiency: {EngineEfficiency}
//Weight: {CarWeight}
//Color: {CarColor}"
    StringBuilder sb = new StringBuilder();
    sb.append(this.model).append(":").append(System.lineSeparator())
            .append(this.engine.toString()).append(System.lineSeparator())
            .append("Weight: ").append(this.weight).append(System.lineSeparator())
            .append("Color: ").append(this.color);

    return sb.toString();
}
}
