public class Teacher extends Persons{
    double salary;
    String subject;
    Teacher(String name, String dob, double salary, String subject){
        super(name, dob);
        this.salary = salary;
        this.subject = subject;
    }

    void getDetails(){
        super.getDetails();
        System.out.printf("Salary : %f%nSubject : %s%n", this.salary, this.subject);
    }
}
