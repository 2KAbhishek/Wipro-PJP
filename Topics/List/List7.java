import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class List7 {

    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();
        Employee emp1 = new Employee(101, "Popeye", "popeye@sailor.man", 'M', 25000);
        Employee emp2 = new Employee(102, "Rambo", "rambo@roc.ky", 'M', 30000);
        Employee emp3 = new Employee(103, "Wick", "john@wi.ck", 'M', 35000);
        Employee emp4 = new Employee(104, "Bond", "007@jam.es", 'M', 40000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Using Iterator:");
        Iterator<Employee> it = list.iterator();
        while (it.hasNext())
            it.next().GetEmployeeDetails();

        System.out.println("Using Enumeration:");
        Enumeration<Employee> en = list.elements();
        while (en.hasMoreElements())
            en.nextElement().GetEmployeeDetails();

    }

}
