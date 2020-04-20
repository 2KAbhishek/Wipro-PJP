public class TestEmployee{
    public static void main(String[] args){
    Person p1 = new Person("Brandon");
    Employee e1 = new Employee("Marco", 25000.0, 2018, "XCV7583");
    System.out.println("Person name : " + p1.getName());
    System.out.printf("Employee name : %s%nSalary : %f%nYear Of Joining : %d%nInsuarance No. : %s%n",
            e1.getName(), e1.getSalary(), e1.getYoj(), e1.getInsNo());
    }
}
