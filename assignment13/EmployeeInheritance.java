import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getBonus() {
        return 0;
    }

    public double getTotalCompensation() {
        return salary + getBonus();
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary * 0.10;
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter role (Manager/Developer): ");
        String role = sc.next();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp;
        if (role.equalsIgnoreCase("Manager")) {
            emp = new Manager(name, salary);
        } else {
            emp = new Developer(name, salary);
        }

        System.out.printf("Bonus ₹%.0f; Total Compensation ₹%.0f\n",
                emp.getBonus(), emp.getTotalCompensation());
        sc.close();
    }
}