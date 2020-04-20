public class TestSchool{
    public static void main(String[] args){
    Persons p1 = new Persons("Puja","07/02/1995");
    Teacher t1 = new Teacher("Sandeep", "10/11/1987", 25000, "Computer Science");
    Student s1 = new Student("Nihar", "08/05/2005", "STU099");
    CollegeStudent cs1 = new CollegeStudent("Priya", "04/03/1998", "STU007", "2K University");
    p1.getDetails();
    t1.getDetails();
    s1.getDetails();
    cs1.getDetails();
    }
}
