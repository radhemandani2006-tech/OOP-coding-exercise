public class practical12 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        practical12 obj = new practical12();

        double cubeVolume = obj.calculateVolume(5);

        double rectangularCubeVolume = obj.calculateVolume(4, 5, 6);

        double sphereVolume = obj.calculateVolume(3.0f);

        System.out.println("Volume of Cube: " + cubeVolume);

        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);

        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
