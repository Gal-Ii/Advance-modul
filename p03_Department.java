package f06_Defining_Classes.Company_rooster;

import java.util.ArrayList;
import java.util.List;

public class p03_Department {

    private  String name;
    private List<p03_Company_Roster> employees;

    public p03_Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(p03_Company_Roster employee){
        this.employees.add(employee);

    }

    public  double getDepartmentSalary(){
        double sum = 0;
        for (p03_Company_Roster employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public List<p03_Company_Roster> getEmployees() {
        return employees;
    }

  public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Highest Average Salary: ").append(this.name).append(System.lineSeparator());
      for (p03_Company_Roster employee : this.employees) {
          sb.append(employee.toString()).append(System.lineSeparator());
      }
      return sb.toString();
    }
}
