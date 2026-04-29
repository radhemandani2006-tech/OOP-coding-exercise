import java.util.Scanner;

public class practical11 {

    String collegeName;

    practical11(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        String studentName;
        String course;

        void accept() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        void display() {

            System.out.println("\nAdmission Details");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        practical11 college = new practical11("ABC College");

        practical11.Admission student = college.new Admission();

        student.accept();

        student.display();
    }
}
