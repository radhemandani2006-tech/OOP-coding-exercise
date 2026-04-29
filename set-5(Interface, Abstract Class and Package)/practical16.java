interface Classify {

    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {

        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

public class practical16 {

    public static void main(String[] args) {

        Result r = new Result();

        double average = 75;

        System.out.println("Average: " + average);

        System.out.println("Division: " + r.getDivision(average));
    }
}
