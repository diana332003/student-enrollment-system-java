package StudentSystem;

public class EnrollmentManager {

    public void enrollStudent(Student student, Course course) {

        if (student == null || course == null) {
            System.out.println("Invalid student or course.");
            return;
        }

        student.enrollCourse(course);

        System.out.println("Student enrolled successfully.");
    }

    public void dropCourse(Student student, Course course) {

        if (student == null || course == null) {
            System.out.println("Invalid student or course.");
            return;
        }

        student.dropCourse(course);

        System.out.println("Course dropped successfully.");
    }

    public void viewStudentCourses(Student student) {

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        if (student.getCourses().isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        for (Course c : student.getCourses()) {
            c.displayCourse();
        }
    }
}