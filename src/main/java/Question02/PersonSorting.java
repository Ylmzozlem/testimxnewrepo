package Question02;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class PersonSorting {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 22)
        };

        Arrays.sort(people, Comparator.comparingInt(person -> person.age));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}