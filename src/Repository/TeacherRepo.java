package Repository;

import Classes.Teacher;

import java.util.*;

public class TeacherRepo extends InMemoryRepo<Teacher> {

    public TeacherRepo(){
        super();
    }

    /**
     * Aktualisiere die Liste der Vorlesungen eines Professors
     * @param obj = der Professor
     */
    @Override
    public void update(Teacher obj) {

        Teacher teacherUpdate;
        Optional<Teacher> found = Optional.empty();
        for (Teacher teacher : this.repoList) {
            if (Objects.equals(teacher.getFirstName(), obj.getFirstName()) && Objects.equals(teacher.getLastName(), obj.getLastName())) {
                found = Optional.of(teacher);
                break;
            }
        }
        teacherUpdate = found.orElseThrow();
        obj.setCourses(teacherUpdate.getCourses());
    }
}

