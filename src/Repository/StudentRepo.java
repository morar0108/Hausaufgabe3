package Repository;

import Classes.Student;

import java.util.Optional;

public class StudentRepo extends InMemoryRepo<Student> {

    public StudentRepo(){

        super();
    }

    /**
     * aktualisiere die Daten des Studenten nach dem Id
     * @param obj = der Student
     */
    @Override
    public void update(Student obj) {
        Student studentUpdate;
        Optional<Student> found = Optional.empty();
        for (Student student : this.repoList) {
            if (student.getStudentId() == obj.getStudentId()) {
                found = Optional.of(student);
                break;
            }
        }
        studentUpdate = found.orElseThrow();
        obj.setEnrolledCourses(studentUpdate.getEnrolledCourses());
        obj.setTotalCredits(studentUpdate.getTotalCredits());
    }
}



