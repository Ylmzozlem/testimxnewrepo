package Question25;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 16);

        System.out.println(person1.name + " is an adult: " + person1.isAdult());
        System.out.println(person2.name + " is an adult: " + person2.isAdult());
    }
}
