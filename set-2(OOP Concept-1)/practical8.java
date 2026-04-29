public class practical8 {

    int x;
    int y;

    practical8() {
        x = 5;
        y = 5;
    }

    practical8(int x, int y) {
        this.x = x;
        this.y = y;
    }

    practical8(practical8 p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        practical8 p1 = new practical8();

        practical8 p2 = new practical8(10, 20);

        practical8 p3 = new practical8(p2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("\nParameterized Constructor:");
        p2.display();

        System.out.println("\nCopy Constructor:");
        p3.display();
    }
}
