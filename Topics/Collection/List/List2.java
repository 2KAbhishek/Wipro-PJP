public class List2 {

    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(101, "Popeye", "popeye@sailor.man", 'M', 25000);
        Employee emp2 = new Employee(102, "Rambo", "rambo@roc.ky", 'M', 30000);
        Employee emp3 = new Employee(103, "Wick", "john@wi.ck", 'M', 35000);
        Employee emp4 = new Employee(104, "Bond", "007@jam.es", 'M', 40000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            emp.GetEmployeeDetails();

        System.out.println();
        empDb.deleteEmployee(101);

        for (Employee emp : empDb.listAll())
            emp.GetEmployeeDetails();

        System.out.println();

        System.out.println(empDb.showPaySlip(103));
    }

}
