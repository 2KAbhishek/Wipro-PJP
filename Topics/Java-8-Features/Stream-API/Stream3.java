import java.util.ArrayList;
import java.util.Arrays;

class Student {
    int rollNo, marks;
    String name;

    Student(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
}

public class Stream3 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, 34, "Suvojit");
        Student stu2 = new Student(2, 94, "Priya");
        Student stu3 = new Student(3, 92, "Abhishek");
        Student stu4 = new Student(4, 73, "Anirban");
        Student stu5 = new Student(5, 42, "Ananta");
        ArrayList<Student> stus = new ArrayList<>(Arrays.asList(stu1, stu2, stu3, stu4, stu5));
        int goodStus = (int) stus.stream().filter(stu -> stu.marks >= 50).count();
        System.out.println("Students with more than 50 : " + goodStus);
    }
}
