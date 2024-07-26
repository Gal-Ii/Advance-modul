package f06_Defining_Classes.Raw_Data;

import java.util.ArrayList;
import java.util.List;

public class Tires {
//    {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}"

    private double pressure;
    private int age;

    public Tires(double pressure, int age){
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
