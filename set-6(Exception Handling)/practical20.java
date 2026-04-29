public class practical20 {

    public static void main(String[] args) {

        try {

            int numerator = Integer.parseInt(args[0]);

            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Please enter numerator and denominator.");

        } catch (NumberFormatException e) {

            System.out.println("Error: Please enter valid integer values.");

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }
}
