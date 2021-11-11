package Controller;

import Classes.*;
import Repository.*;
import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class RegistrationSystemTest {

    RegistrationSystem registrationSystem = new RegistrationSystem(null, null, null);
    Teacher teacher1 = new Teacher("Morar", "Maria");
    Teacher teacher2 = new Teacher("Morar", "Ana");
    TeacherRepo teacherRepo = new TeacherRepo();
    Course course1 = new Course("MAP", teacher1, 12, 6);
    Course course2 = new Course("ASC", teacher2, 15, 5);
    Course course3 = new Course("Logica", teacher1, 20, 5);
    CourseRepo courseRepo = new CourseRepo();
    Student student1 = new Student("Popescu", "Marius", 123);
    Student student2 = new Student("Iliescu", "Mara", 124);
    StudentRepo studentRepo = new StudentRepo();

    @BeforeEach
    void init(){
        teacherRepo.create(teacher1);
        teacherRepo.create(teacher2);
        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher2.addCourse(course3);
        courseRepo.create(course1);
        courseRepo.create(course2);
        courseRepo.create(course3);
        studentRepo.create(student1);
        studentRepo.create(student2);
        registrationSystem.register(course1,student1);
        registrationSystem.register(course1,student2);
        registrationSystem.register(course2,student2);
        registrationSystem.register(course3,student1);
    }

    @Test
    void register() {
        List<Course> coursesList;
        coursesList = new ArrayList<>(Arrays.asList(course1, course2));
        List<Student> studentsList;
        studentsList = new ArrayList<>(Arrays.asList(student1, student2));
        assertEquals(coursesList, student1.getEnrolledCourses());
        assertEquals(studentsList, course2.getStudentsEnrolled());
    }

    @Test
    void retrieveCoursesWithFreePlaces() {
        List<Course> freePlacesCourses = registrationSystem.retrieveCoursesWithFreePlaces();
        List<Course> expectedCourses = new ArrayList<>(List.of(course3));
        assertEquals(expectedCourses,freePlacesCourses);
    }

    @Test
    void retrieveStudentsEnrolledForACourse() {
        List<Student> enrolledStudents = registrationSystem.retrieveStudentsEnrolledForACourse(course2);
        List<Student> expectedStudents = new ArrayList<>(Arrays.asList(student1, student2));
        assertEquals(expectedStudents,enrolledStudents);
    }
}