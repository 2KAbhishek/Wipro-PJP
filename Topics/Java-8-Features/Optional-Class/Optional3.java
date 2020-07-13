import java.util.Optional;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (name + " " + salary);
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException() {
        super();
        System.out.println("Invalid employee!");
    }
}

public class Optional3 {
    public static void main(String[] args) throws InvalidEmployeeException {
        Employee emp1 = null;
        // Employee emp1 = new Employee("John Doe", 1234);
        Optional<Employee> emp = Optional.ofNullable(emp1);
        System.out.println(emp.orElseThrow(InvalidEmployeeException::new));
    }
}
