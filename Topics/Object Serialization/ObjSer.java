import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter name: ");
        emp.setName(sc.nextLine());
        System.out.print("Enter D.O.B.: ");
        emp.setDob(sc.nextLine());
        System.out.print("Enter department: ");
        emp.setDepartment(sc.nextLine());
        System.out.print("Enter designation: ");
        emp.setDesignation(sc.nextLine());
        System.out.print("Enter salary: ");
        emp.setSalary(sc.nextDouble());
        sc.nextLine();
        sc.close();

        FileOutputStream fos = new FileOutputStream("Employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);
        fos.close();
        oos.close();

        System.out.println();
        System.out.println("Details written to file.");
        System.out.println();

        FileInputStream fis = new FileInputStream("Employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee empr = (Employee) ois.readObject();

        System.out.println("Name: " + empr.getName());
        System.out.println("D.O.B.: " + empr.getDob());
        System.out.println("Department: " + empr.getDepartment());
        System.out.println("Designation: " + empr.getDesignation());
        System.out.println("Salary: " + empr.getSalary());
        fis.close();
        ois.close();
    }
}
