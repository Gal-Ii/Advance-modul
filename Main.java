package f06_Defining_Classes.Google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> peopleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            String personName = inputArr[0];

            Person person = getPersonByName(peopleList, personName);

            if (input.contains("company")) {
                String companyName = inputArr[2];
                String department = inputArr[3];
                double salary = Double.parseDouble(inputArr[4]);

                Company company = new Company(companyName, department, salary);
                person.setCompany(company);

            } else if (input.contains("pokemon")) {
                String pokemonName = inputArr[2];
                String type = inputArr[3];

                Pokemon pokemon = new Pokemon(pokemonName, type);
                person.addPokemon(pokemon);

            } else if (input.contains("parents")) {
                String parentName = inputArr[2];
                String birthday = inputArr[3];

                Relative parent = new Relative(parentName, birthday);
                person.addParents(parent);

            } else if (input.contains("children")) {
                String childName = inputArr[2];
                String birthday = inputArr[3];

                Relative children = new Relative(childName, birthday);
                person.addChildren(children);

            } else if (input.contains("car")) {
                String model = inputArr[2];
                int speed = Integer.parseInt(inputArr[3]);
                Car car = new Car(model, speed);
                person.setCar(car);
            }
            input = scanner.nextLine();
        }
        String inputName = scanner.nextLine();
        Person person = getPersonByName(peopleList, inputName);
        System.out.println(person);
    }

    private static Person getPersonByName(List<Person> peopleList, String personName) {
        for (Person person : peopleList) {
            if (person.getName().equals(personName)) {
                return person;
            }
        }
        Person person = new Person(personName);
        peopleList.add(person);
        return person;
    }
}
