import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightKg = pounds * 0.45359237;
        double heightMeter = inches * 0.0254;

        double bmi = weightKg / (heightMeter * heightMeter);

        System.out.printf("BMI = %.2f", bmi);

        sc.close();
    }
}
