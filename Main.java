package StudentSystem;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    StudentManager manager = new StudentManager();

    int choice;

    do {

      System.out.println("\n===== Student System =====");
      System.out.println("1 Add Student");
      System.out.println("2 View Students");
      System.out.println("3 Search Student");
      System.out.println("4 Exit");

      choice = input.nextInt();

      if (choice == 1) {

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        Student s = new Student(id, name, gpa);
        manager.addStudent(s);

      }

      else if (choice == 2) {
        manager.displayStudents();
      }

      else if (choice == 3) {

        System.out.print("Enter ID: ");
        int id = input.nextInt();

        Student s = manager.searchStudent(id);

        if (s != null)
          s.displayStudent();
        else
          System.out.println("Student not found");
      }

    } while (choice != 4);

  }
}