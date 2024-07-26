package f06_Defining_Classes.Google;

public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary){
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return String.format("%s %s %.2f", this.companyName, this.department, this.salary);
    }
}
