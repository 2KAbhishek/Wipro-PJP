import java.util.ArrayList;

public class Employee {
    public String findName(ArrayList<String> employees, String name){
        String result = "";
        if (employees.contains(name))
            result = "FOUND";
        else
            result = "NOT FOUND";
        return result;
    }
}
