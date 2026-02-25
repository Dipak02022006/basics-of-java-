// Base class
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus (default)
    double calculateBonus() {
        return salary * 0.10;  // 10% bonus
    }

    // Method to generate performance report
    void generatePerformanceReport() {
        System.out.println("Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    // Method to manage project
    void manageProject() {
        System.out.println(name + " is managing a general company project.");
    }
}

// Manager subclass
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }

    @Override
    void manageProject() {
        System.out.println(name + " is managing multiple teams and projects.");
    }
}

// Developer subclass
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;  // 15% bonus
    }

    @Override
    void manageProject() {
        System.out.println(name + " is developing software modules.");
    }
}

// Programmer subclass
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.12;  // 12% bonus
    }

    @Override
    void manageProject() {
        System.out.println(name + " is writing and testing code.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee m = new Manager("Rahul", "Mumbai", 80000);
        Employee d = new Developer("Sneha", "Pune", 60000);
        Employee p = new Programmer("Amit", "Delhi", 50000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        m.generatePerformanceReport();
        m.manageProject();

        System.out.println("\nDeveloper Bonus: " + d.calculateBonus());
        d.generatePerformanceReport();
        d.manageProject();

        System.out.println("\nProgrammer Bonus: " + p.calculateBonus());
        p.generatePerformanceReport();
        p.manageProject();
    }
}
