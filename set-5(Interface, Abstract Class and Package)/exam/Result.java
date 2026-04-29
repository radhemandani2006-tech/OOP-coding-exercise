package exam;

import student.Student;

public class Result extends Student {

    int subject1;
    int subject2;
    int subject3;

    public Result(int rollNumber, String studentName, int s1, int s2, int s3) {

        super(rollNumber, studentName);

        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    public void displayMarksheet() {

        showStudentDetails();

        int totalMarks = subject1 + subject2 + subject3;

        double averageMarks = totalMarks / 3.0;

        System.out.println("Marks in Subject 1 : " + subject1);
        System.out.println("Marks in Subject 2 : " + subject2);
        System.out.println("Marks in Subject 3 : " + subject3);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + averageMarks);
    }
}
