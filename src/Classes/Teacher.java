package Classes;

import java.util.*;


public class Teacher extends Person {

    private List<Course> courses;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * Hinzufugen eine Vorlesung in der Liste des Proffesors
     * @param course = neue Vorlesung
     */
    public void addCourse(Course course){
        if (!courses.contains(course)) courses.add(course);
    }

    /**
     * Losche einen Vorlesung von der Liste des Professors
     * @param course = die Vorlesung
     */
    public void removeCourse(Course course){
        courses.remove(course);
    }
}
