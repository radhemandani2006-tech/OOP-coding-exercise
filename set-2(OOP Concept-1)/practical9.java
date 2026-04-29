public class practical9 {

    double width;
    double height;

    practical9(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        practical9 r1 = new practical9(4, 40);

        practical9 r2 = new practical9(3.5, 35.9);

        System.out.println("Rectangle 1");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("\nRectangle 2 has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}
