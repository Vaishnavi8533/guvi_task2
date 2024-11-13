package task2;

// Base class Person
class Person {
    protected String name;
    protected int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Employee that extends Person
class Employee extends Person {
    private String employeeID;
    private double salary;

    // Constructor for Employee class using super to initialize name and age
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Call to the superclass constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        displayPersonInfo(); // Display name and age from Person
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp = new Employee("Alice", 30, "E12345", 50000.0);

        // Displaying employee information
        emp.displayEmployeeInfo();
    }
}
