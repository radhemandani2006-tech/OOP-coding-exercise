package student;

public class Student {

    protected int rollNumber;
    protected String studentName;

    public Student(int rollNumber, String studentName) {

        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    public void showStudentDetails() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Student Name : " + studentName);
    }
}
