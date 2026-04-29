class Employee {

    String name = "Raj";
    String department = "Computer";

    void displayDetails() {

        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {

    int teamSize = 10;
    String projectName = "Bank Management System";

    void displayDetails() {

        System.out.println("Manager Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class practical15 {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.displayDetails();

        System.out.println();

        Manager m = new Manager();

        m.displayDetails();
    }
}
