import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    int empNo, salary;
    String name;

    Employee(int empNo, int salary, String name) {
        this.empNo = empNo;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.printf("Employee Details: \n Number :  %d \n Salary : %d \n Name : %s \n", empNo, salary, name);
        return "";
    }

}

public class FunInterface4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 4000, "Suvojit");
        Employee emp2 = new Employee(2, 24000, "Priya");
        Employee emp3 = new Employee(3, 22000, "Abhishek");
        Employee emp4 = new Employee(4, 3000, "Anirban");
        Employee emp5 = new Employee(5, 22000, "Abhishek");
        ArrayList<Employee> emps = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));
        Predicate<Employee> lt = emp -> emp.salary < 10000;
        emps.stream().filter(lt).forEach(System.out::print);
    }
}
