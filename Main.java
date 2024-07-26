package f06_Defining_Classes.Opinion_Poll;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = getPersonByName(persons, name, age);
        }
        persons = persons.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        persons.sort(Comparator.comparing(person -> person.getName()));

        for (Person person : persons) {
            System.out.println(person.toString());
        }

    }

    private static Person getPersonByName(List<Person> persons, String name, int age) {
        for (Person p : persons) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        Person person = new Person(name, age);
        persons.add(person);
        return person;
    }
}
