package org.example;

import java.util.Arrays;
import java.time.LocalDate;

/**
 * The type Main.
 */
/*
   Finally, write a Main class in which, we will test our code. In the main method,
    the following should be done: • Create 4 students and 2 professors
    using the different constructors. • Test the assignGrade() method with input
    parameters of your choice.  • Put the students in an array and do
    the same for the professors.  • Print the first names and last names
    of all excellent students.   • Print the first name and last name of the
    student with the highest grade average.
 */

public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student(345, "Methu", "Sela", LocalDate.of(2000, 5, 2),Arrays.asList(13, 26, 28));
        Student student2 = new Student(18, "Mario", "Gatti", LocalDate.of(1998, 7, 19), Arrays.asList(30, 29, 27));
        Student student3 = new Student(129, "Vicenzo", "Bianchi", LocalDate.of(1997, 7, 1), Arrays.asList(19, 20, 18));
        Student student4 = new Student(803, "Aldo", "Cassano", LocalDate.of(2004, 3, 14), Arrays.asList(29, 22, 18));

        Professor professor1 = new Professor(1, "Giuseppe", "Rossi", "Matematica");
        Professor professor2 = new Professor(3, "Pasquale", "De Andrè", "Storia");
        Professor professor3 = new Professor(2, "Antonella", "Prosdocimo", "Italiano");
        // Put the students in an array
        Student[] students = {student1, student2, student3, student4};
        Professor[] professors = new Professor[3];
        professors[0] = professor1;
        professors[1] = professor2;
        professors[2] = professor3;
        // Put the professors in an array

        // Test the assignGrade() method with input parameters of your choice
        professor1.assignGrade(student1, 18);
        professor1.assignGrade(student2, 26);
        professor2.assignGrade(student3, 28);
        professor2.assignGrade(student4, 17);
        professor3.assignGrade(student2, 30);
        professor2.assignGrade(student3, 22);
        professor1.assignGrade(student2, 25);
        professor3.assignGrade(student2, 27);




        // Print the first names and last names of all excellent students
        System.out.println("Excellent students:");
        for (Student student : students)
            if (student.isExcellentStudent()) {
                System.out.println(student.getName() + " " + student.getSurname());
            }


        Student studentWithHighestGradeAverage = null;
        double highestGradeAverage = 0.0;

        for (Student student : students) {
            double gradeAverage = student.calculateGradeAverage();
            if (gradeAverage > highestGradeAverage) {
                highestGradeAverage = gradeAverage;
                studentWithHighestGradeAverage = student;
            }
        }

        System.out.println("The Student with the highest grade average is:");
        System.out.println(studentWithHighestGradeAverage.getName() + " " + studentWithHighestGradeAverage.getSurname());
    }
}


