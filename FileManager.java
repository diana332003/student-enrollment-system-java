package StudentSystem;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveStudents(ArrayList<Student> students) {

        try {

            FileWriter writer = new FileWriter("data/students.txt");

            for (Student s : students) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getGpa() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving students.");
        }
    }

    public static void saveCourses(ArrayList<Course> courses) {

        try {

            FileWriter writer = new FileWriter("data/courses.txt");

            for (Course c : courses) {
                writer.write(c.getCode() + "," + c.getTitle() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving courses.");
        }
    }
}