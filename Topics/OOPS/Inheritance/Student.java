public class Student extends Persons{
    String stuID;
    Student(String name, String dob, String stuID){
        super(name, dob);
        this.stuID = stuID;
    }

    void getDetails(){
        super.getDetails();
        System.out.printf("Student ID : %s%n", this.stuID);
    }
}
