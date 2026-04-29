import java.util.ArrayList;
import java.util.Collections;

public class practical29 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(68);
        marks.add(95);

        System.out.println("Student Marks:");

        for (int m : marks) {

            System.out.println(m);
        }

        int highest = Collections.max(marks);

        int lowest = Collections.min(marks);

        System.out.println("\nHighest Marks: " + highest);

        System.out.println("Lowest Marks: " + lowest);
    }
}
