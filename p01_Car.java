package f06_Defining_Classes;

public class p01_Car {
    private String brand;
    private String model;
    private int horsePower;


    public p01_Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;

    }

    public p01_Car(String brand){
        this(brand, "unknown", -1);

    }

   public  String getInfo(){
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
    }
}
