package Classes;

import java.util.*;

public class Course {

    public String name;
    public Person teacher;
    public int maxEnrollement;
    public List<Student> studentsEnrolled;
    public int credits;

    public Course(String name, Person teacher, int maxEnrollement, int credits) {
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollement = maxEnrollement;
        this.studentsEnrolled = new ArrayList<Student>();
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public int getMaxEnrollement() {
        return maxEnrollement;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Kurs : Name Kurs = %s, Professor = %s, maxPlatze =%d, eingeschriebene Studenten = %s, TotalKredit = %d\n".formatted(name, teacher, maxEnrollement, studentsEnrolled, credits);
    }

    /**
     * Ich fuge einen Student in der Liste und behandle 3 Falle: -> wenn an den Kurs den maximalen Teilnehmende sind
     *                                                           -> wenn der Student schon bei den Kurs eingeschrieben ist
     *                                                           -> wenn keine der zwei obigen Falle getroffen sind, dann fuge ich den Student in der Liste hinzu
     * @param student = der Student der in der Liste eingeschrieben wird
     */
    public void addStudent(Student student){

        if (!studentsEnrolled.contains(student)) {
            if(maxEnrollement == studentsEnrolled.size())
                System.out.print("In den Saal des Kurses gibt es keine freie Plateze mehr.");
        } else System.out.print("Der Student ist schon an den Kurs eingeschrieben");
        studentsEnrolled.add(student);
    }

}


