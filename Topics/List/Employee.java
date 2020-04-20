public class Employee {
    private int EmpId;
    private String EmpName;
    private String EmpEmail;
    private char EmpGender;
    private float EmpSalary;

    public Employee() {}

    public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
        super();
        EmpId = empId;
        EmpName = empName;
        EmpEmail = empEmail;
        EmpGender = empGender;
        EmpSalary = empSalary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail
                + ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]");
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }

    public char getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(char empGender) {
        EmpGender = empGender;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float empSalary) {
        EmpSalary = empSalary;
    }


}
