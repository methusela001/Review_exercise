package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private List<Integer> grades;
    private String courseName;

   public String getCourseName() {
       return courseName;
   }
   public void setCourseName(String courseName) {
       this.courseName = courseName;
   }
    /**
     * Instantiates a new Student.
     *
     * @param id   the student id
     * @param name   the first name
     * @param surname    the last name
     * @param dateOfBirth the date of birth
     */

    public Student(int id, String name, String surname,LocalDate dateOfBirth, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.grades = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets date of birth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets grades.
     *
     * @return the grades
     */
    public List<Integer> getGrades() {
        return grades;
    }

    /**
     * Sets grades.
     *
     * @param grades the grades
     */
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    /**
     * Calculate grade average double.
     *
     * @return the double
     */
    public double calculateGradeAverage() {
        if (grades == null || grades.isEmpty()) {
            return -1;
        } else {
            int sum = 0;
            for (int grade : grades)
                sum += grade;

            return (double) sum / grades.size();

        }
    }

    /**
     * Assign grade.
     *
     * @param s     the student
     * @param grade the grade
     */
    public void assignGrade(Student s, int grade) {
        if (grade >= 18) {
            s.getGrades().add(grade);
        } else {
            System.out.println("Sorry, you have failed the exam.");
        }
    }

    /**
     * Is excellent student boolean.
     *
     * @return the boolean
     */
    public boolean isExcellentStudent() {
        for (int grade : grades) {
            if (grade < 18) {
                return false;
            }
        }
        return true;

    }
}






