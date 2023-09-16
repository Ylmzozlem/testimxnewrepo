package Question28;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Raise of $" + amount + " applied to " + name + "'s salary");
        } else {
            System.out.println("Invalid raise amount");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 101, 50000.0);
        employee.giveRaise(2000.0);
        employee.displayInfo();
    }
}
