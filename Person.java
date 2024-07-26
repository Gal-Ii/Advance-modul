package f06_Defining_Classes.Opinion_Poll;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String toString(){
        return String.format("%s - %d", this.name, this.age);
    }
}
