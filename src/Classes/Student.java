package Classes;

import java.util.*;

public class Student extends Person {

    private int studentId;
    private int totalKredit;
    private List<Course> eingeschriebeneKurse;

    public Student(String firstName, String lastName, int studentId) {

        super(firstName, lastName);
        this.studentId = studentId;
        this.totalKredit = 0;
        this.eingeschriebeneKurse = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalCredits() {
        return totalKredit;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalKredit = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return eingeschriebeneKurse;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.eingeschriebeneKurse = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student : Name = %s, Vorname = %s, StudentId = %d, TotalKredit = %d".formatted(getFirstName(), getLastName(), studentId, totalKredit);
    }

    /**
     * Fuge der Student in der Liste von CourseRepo ein
     *
     * @param course = die neue Vorlesung
     */
    public void addCourse(Course course) {

        if (eingeschriebeneKurse.contains(course)) System.out.print("Kurs ist schon in der Liste des Studenten");
        else{

            if (totalKredit + course.getCredits() > 30) {
                System.out.print("Du hast mehr als 30 Kreditnummers als erlaubt, der Kurs konnte nicht eingefugt werden.");
            } else {
                eingeschriebeneKurse.add(course);
                totalKredit += course.getCredits();
            }
        }
    }

    /**
     * Ich losche einen Vorlesung aus der Liste der Student
     *
     * @param course = neue Vorlesung
     */
    public void removeCourse(Course course){

        if (eingeschriebeneKurse.contains(course)) {

            totalKredit -= course.getCredits();
            eingeschriebeneKurse.remove(course);
        } else System.out.print("Kurs existiert nicht in der Liste des Studenten");
    }

}
