package org.example;
//Design the Professor class.
// • The attributes are an ID, a first name, a last name, and the name of the
// course taught by the professor. • Write a constructor for this class that takes
// all the attributes and another constructor without the course taught, along with
// getters and setters for all attributes. • The class will also have the following method:
// ▪ assignGrade(Student s, int grade), which adds the grade to
// the student s grades list if the grade is greater than or equal to 18; otherwise,
// it prints a message to inform the student that they have failed.

import java.util.ArrayList;


/**
 * The class Professor.
 */
public class Professor {
    private int id;
    private String firstName;
    private String lastName;
    private String courseName;


    /**
     * Instantiates a new Professor.
     *
     * @param id         the id
     * @param firstName  the first name
     * @param lastName   the last name
     * @param courseName the course name
     */
    public Professor(int id, String firstName, String lastName, String courseName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
    }

    /**
     * Instantiates a new Professor.
     *
     * @param id        the id
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Professor(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets course name.
     *
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets course name.
     *
     * @param courseName the course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Assign grade.
     *
     * @param student the student
     * @param grade   the grade
     */
    public void assignGrade(Student student, int grade) {
        while (grade >= 18) {
            if (student.getGrades() == null || student.getGrades().isEmpty()) {
                student.setGrades(new ArrayList<>());
            }
            System.out.println("The student " + student.getName() + " " + student.getSurname() + " has passed the exam.");

            return;
        }
        System.out.println("The student " + student.getName() + " " + student.getSurname() + " has not passed the exam.");
    }

}