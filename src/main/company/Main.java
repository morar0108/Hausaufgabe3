package main.company;

import Controller.RegistrationSystem;
import Classes.*;
import Repository.*;


public class Main {

    public static void main(String[] args) {
        TeacherRepo teacherRepo = new TeacherRepo();
        Teacher teacher1 = new Teacher("Morar", "Ana");
        Teacher teacher2 = new Teacher("Mocean", "Ion");
        teacherRepo.create(teacher1);
        teacherRepo.create(teacher2);

        CourseRepo courseRepo = new CourseRepo();
        Course course1 = new Course("MAP", teacher1,2, 10 );
        Course course2 = new Course("Biochimie", teacher1, 2, 10);
        Course course3  = new Course("Logica", teacher2, 2, 11);

        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher2.addCourse(course3);

        courseRepo.create(course1);
        courseRepo.create(course2);
        courseRepo.create(course3);


        StudentRepo studentRepo = new StudentRepo();
        Student student1 = new Student("Oros", "Mara", 110);
        Student student2 = new Student("Popescu", "Vasile", 125);
        Student student3 = new Student("Veliciu", "Vlad", 118);
        studentRepo.create(student1);
        studentRepo.create(student2);
        studentRepo.create(student3);

        RegistrationSystem registrationSystems = new RegistrationSystem(courseRepo,teacherRepo,studentRepo);
        registrationSystems.register(course1,student1);
        registrationSystems.register(course1,student2);
        registrationSystems.register(course2,student1);
        registrationSystems.register(course2,student3);
        registrationSystems.register(course3,student3);
        registrationSystems.register(course3,student1);

        System.out.println(student1.getTotalCredits());
        System.out.print("\n");
        System.out.println(registrationSystems.retrieveCoursesWithFreePlaces());
        System.out.print("\n");
        registrationSystems.retrieveStudentsEnrolledForACourse(course2);
        System.out.print("\n");
        System.out.println(registrationSystems.getAllCourses());

    }
}
