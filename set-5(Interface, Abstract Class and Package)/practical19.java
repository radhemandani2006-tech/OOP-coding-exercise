import exam.Result;
import java.util.Scanner;

public class practical19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1 : ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2 : ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3 : ");
        int m3 = sc.nextInt();

        Result student = new Result(roll, name, m1, m2, m3);

        System.out.println("\n----- STUDENT MARKSHEET -----");

        student.displayMarksheet();

        sc.close();
    }
}
