package f06_Defining_Classes.Company_rooster;

import java.util.*;

public class p03_Main_Company_Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<p03_Department> departmentList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String departmentName = input[3];
            String email = "n/a";
            int age = -1;

            if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            } else if (input.length == 5) {
                if (input[4].contains("@")) {
                    email = input[4];
                } else {
                    age = Integer.parseInt(input[4]);
                }
            }

            p03_Company_Roster employee = new p03_Company_Roster(name, salary, position, email, age);

            p03_Department department = getDepartmentByName(departmentList, departmentName);
            department.addEmployee(employee);

        }

        Collections.sort(departmentList, Comparator.comparing(p03_Department::getDepartmentSalary).reversed());
        p03_Department highestPaiedDepartment = departmentList.get(0);
        Collections.sort(highestPaiedDepartment.getEmployees(), Comparator.comparing(p03_Company_Roster::getSalary).reversed());
        System.out.println(highestPaiedDepartment);
    }

    private static p03_Department getDepartmentByName(List<p03_Department> departmentList, String departmentName) {
        for (p03_Department d : departmentList) {
            if (d.getName().equals(departmentName)) {
                return d;
            }
        }

        p03_Department department = new p03_Department(departmentName);
        departmentList.add(department);

        return department;
    }
}
