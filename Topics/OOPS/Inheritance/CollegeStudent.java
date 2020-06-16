public class CollegeStudent extends Student{
    String college;
    CollegeStudent(String name, String dob, String stuID, String college){
        super(name, dob, stuID);
        this.college = college;
    }

    void getDetails(){
        super.getDetails();
        System.out.printf("College Name : %s%n", this.college);
    }
}
