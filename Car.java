package f06_Defining_Classes.Speed_Rasing;

public class Car {
    private String model;
    private double fuel;
    private double fuelCostPerKm;
    private int distanceTraveled;

    public Car(String model, double fuel, double fuelCostPerKm){
        this.model = model;
        this.fuel = fuel;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return this.model;
    }

    public void drive(int kmToTravel) {
        double furlToDrive = kmToTravel * this.fuelCostPerKm;

        if(this.fuel>=furlToDrive){
            this.fuel -= furlToDrive;
            this.distanceTraveled += kmToTravel;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String toString(){
        return String.format("%s %.2f %d", this.model, this.fuel, this.distanceTraveled);
    }
}
