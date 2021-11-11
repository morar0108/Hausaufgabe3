package Repository;

import Classes.Course;

import java.util.*;

public class CourseRepo extends InMemoryRepo<Course> {

    public CourseRepo(){

        super();
    }

    /**
     * Liste der Studenten die bei einen Vorlesung eingeschrieben sind wird aktualisiert
     * @param obj = die Vorlesung
     */
    @Override
    public void update(Course obj) {

        Course courseUpdate;
        Optional<Course> found = Optional.empty();
        for (Course course : this.repoList) {
            if (Objects.equals(course.getName(), obj.getName()) && course.getTeacher() == obj.getTeacher()) {
                found = Optional.of(course);
                break;
            }
        }
        courseUpdate = found.orElseThrow();
        obj.setCredits(courseUpdate.getCredits());
    }

    /**
     * Losche die Vorlesung aus Repo
     * @param obj = die Vorlesung
     */
    @Override
    public void delete(Course obj) {
        super.delete(obj);
    }
}

