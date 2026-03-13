package StudentSystem;
import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private double gpa;
    private ArrayList<Course> courses;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }

    public void displayStudent() {
        System.out.println(id + " - " + name + " GPA: " + gpa);
    }
}