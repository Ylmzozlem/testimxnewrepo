package Question29;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1990, 5, 15);
        Person person = new Person("Alice", "Smith", dob);
        int age = person.calculateAge();
        System.out.println("Age: " + age + " years");
    }
}
