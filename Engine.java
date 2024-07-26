package f06_Defining_Classes.Car_Salesman;

public class Engine {
//    model, power, displacement, and efficiency
    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine(String model, int power, String displacement, String efficiency){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel(){
        return this.model;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.model).append(":").append(System.lineSeparator())
                .append("Power: ").append(this.power).append(System.lineSeparator())
                .append("Displacement: ").append(this.displacement).append(System.lineSeparator())
                .append("Efficiency: ").append(this.efficiency);

        return sb.toString();
    }
}
