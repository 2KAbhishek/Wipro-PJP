import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

class Employee {
    int empNo, salary;
    String name, location;

    Employee(int empNo, int salary, String name, String location) {
        this.empNo = empNo;
        this.salary = salary;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        System.out.printf("Employee Details: \n Number :  %d \n Salary : %d \n Name : %s \n Location : %s \n", empNo,
                salary, name, location);
        return "";
    }

}

public class FunInterface1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 24000, "Suvojit", "Pune");
        Employee emp2 = new Employee(2, 24000, "Priya", "Delhi");
        Employee emp3 = new Employee(3, 22000, "Abhishek", "Bangalore");
        Employee emp4 = new Employee(4, 23000, "Anirban", "Kolkata");
        Employee emp5 = new Employee(5, 22000, "Abhishek", "Pune");
        ArrayList<Employee> emps = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));
        ArrayList<String> locs = new ArrayList<>();

        Function<Employee, String> getLoc = emp -> emp.location;
        emps.forEach(emp -> locs.add(getLoc.apply(emp)));
        locs.forEach(System.out::println);
    }
}
