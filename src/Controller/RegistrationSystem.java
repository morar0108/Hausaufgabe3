package Controller;

import Classes.*;
import Repository.*;

import java.util.*;

public class RegistrationSystem {

    private final CourseRepo courses;
    private final StudentRepo students;

    public RegistrationSystem(CourseRepo courses, TeacherRepo teachers, StudentRepo students) {
        this.courses = courses;
        this.students = students;
    }

    /**
     * Einschreibung zu einen Kurs
     * @param course = die Vorlesung an dem sich der Student einschreiben will
     * @param student = der Student
     */
    public void register(Course course, Student student) {

        if (students.getAll().contains(student)) {

            if (courses.getAll().contains(course)) {

                student.addCourse(course);
                students.update(student);

                course.addStudent(student);
                courses.update(course);

            } else System.out.print("Diese Vorlesung existiert nicht");
        } else System.out.print("Dieser Student existiert nicht");

    }

    /**
     * @return Liste mit Vorlesungen bei denen noch freie Platze gibt
     */
    public List<Course> retrieveCoursesWithFreePlaces() {
        List<Course> CFP;
        CFP = new ArrayList<>();
        for (Course course : courses.getAll()) {
            int fP;
            fP = course.getMaxEnrollement() - course.getStudentsEnrolled().size();
            if (fP > 0) CFP.add(course);
        }
        return CFP;
    }

    /**
     * Liste mit Sudenten bei einen Vorlesung
     * @param course der Kurs
     * @return
     */
    public List<Student> retrieveStudentsEnrolledForACourse(Course course) {
        if (courses.getAll().contains(course)) {
        } else {
            System.out.print("Dieser Kurs existiert nicht");
        }
        return null;
    }

    /**
     * @return Liste mit alle Vorlesungen
     */
    public List<Course> getAllCourses() {
        return courses.getAll();
    }

}