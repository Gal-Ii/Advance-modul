package f06_Defining_Classes.Company_rooster;

public class p03_Company_Roster {

//    name, salary, position, department, email, and age

    private String name;
    private double salary;
    private String position;
    private String email;
    private int age;


    public p03_Company_Roster(String name, double salary, String position, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.email = email;
        this.age = age;
    }

    public double getSalary() {
        return  this.salary;
    }

    public String toString(){
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
