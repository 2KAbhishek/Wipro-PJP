import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Employee {
    int empNo, age;
    String name, location;

    Employee(int empNo, int age, String name, String location) {
        this.empNo = empNo;
        this.age = age;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        System.out.printf("Employee Details: \n Number :  %d \n Age : %d \n Name : %s \n Location : %s \n", empNo, age,
                name, location);
        return "";
    }

}

public class Stream2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 24, "Suvojit", "Pune");
        Employee emp2 = new Employee(2, 24, "Priya", "Delhi");
        Employee emp3 = new Employee(3, 22, "Abhishek", "Bangalore");
        Employee emp4 = new Employee(4, 23, "Anirban", "Kolkata");
        Employee emp5 = new Employee(5, 22, "Abhishek", "Pune");
        ArrayList<Employee> emps = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp4, emp5));
        ArrayList<Employee> puneEmps = (ArrayList<Employee>) emps.stream().filter(emp -> emp.location == "Pune")
                .collect(Collectors.toList());
        puneEmps.forEach(System.out::println);
    }
}
