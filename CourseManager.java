package StudentSystem;
import java.util.ArrayList;

public class CourseManager {

    private ArrayList<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void displayCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course c : courses) {
            c.displayCourse();
        }
    }

    public Course searchCourse(String code) {

        for (Course c : courses) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }

        return null;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}