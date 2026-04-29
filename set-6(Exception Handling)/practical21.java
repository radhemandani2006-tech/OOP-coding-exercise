public class practical21 {

    void checkEligibility(int age) {

        if (age < 18) {

            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        practical21 obj = new practical21();

        int age = 16;

        try {

            obj.checkEligibility(age);

        } catch (IllegalArgumentException e) {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Validation process completed");
        }
    }
}
