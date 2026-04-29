interface Exam {

    boolean isPassed(int mark);
}

interface Classify {

    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {

        return mark >= 35;
    }

    public String getDivision(double average) {

        if (average >= 60) {
            return "First Division";
        } else if (average >= 45) {
            return "Second Division";
        } else if (average >= 35) {
            return "Pass Division";
        } else {
            return "Fail";
        }
    }
}

public class practical17 {

    public static void main(String[] args) {

        Result r = new Result();

        int mark = 70;

        double average = 68.5;

        System.out.println("Mark: " + mark);

        System.out.println("Passed: " + r.isPassed(mark));

        System.out.println("Average: " + average);

        System.out.println("Division: " + r.getDivision(average));
    }
}
