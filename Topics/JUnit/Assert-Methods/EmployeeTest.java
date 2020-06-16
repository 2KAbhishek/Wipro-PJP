import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class EmployeeTest {
    Employee e = new Employee();
    ArrayList<String> employees = new ArrayList<>();
    {
        employees.add("Ram");
        employees.add("Shyam");
        employees.add("Sita");
    }

    @Test
    public void testFindName() {
        assertEquals("Result", "FOUND", e.findName(employees, "Sita"));
    }

}
