public class Persons{
    String name;
    String dob;

    Persons(String name, String dob){
        this.name = name;
        this.dob = dob;
    }

    void getDetails(){
        System.out.printf("Name : %s%nDOB : %s%n", this.name, this.dob);
    }
}
