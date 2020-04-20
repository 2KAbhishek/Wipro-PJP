package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student data[] = new Student[10];

    static {
        for (int i = 0; i < data.length; i++)
            data [i]= new Student();

        data [0] = new Student("Sekar", new int[] {35, 35, 35});
        data [1] = new Student(null, new int[] {11, 22, 33});
        data [2] = null;
        data [3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        System.out.println("Grade Calculation:");

        String x = null;

        for (int i = 0; i < data.length; i++)  {
            try {
                x = studentReport.validate(data[i]);
            } catch (NullNameException e) {
                x = "NullNameException occured";
            } catch (NullMarksArrayException e) {
                x = "NullMarksArrayException occured";
            } catch (NullStudentException e) {
                x = "NullStudentException occured";
            }

            System.out.println("GRADE = " + x);
        }

        System.out.println("Number of Objects with Marks array as null = " +
                                studentService.findNumberOfNullMarks(data));
        System.out.println("Number of Objects with Name as null = " +
                                studentService.findNumberOfNullNames(data));
        System.out.println("Number of Objects that are entierly null = " +
                                studentService.findNumberOfNullObjects(data));

    }

}
