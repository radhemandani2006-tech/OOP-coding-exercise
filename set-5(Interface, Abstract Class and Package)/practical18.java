abstract class Vehicle {

    abstract String fuelType();

    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class practical18 {

    public static void main(String[] args) {

        Car c = new Car();

        Bike b = new Bike();

        System.out.println("Car");
        System.out.println("Fuel Type: " + c.fuelType());
        System.out.println("Number of Wheels: " + c.noOfWheels());

        System.out.println();

        System.out.println("Bike");
        System.out.println("Fuel Type: " + b.fuelType());
        System.out.println("Number of Wheels: " + b.noOfWheels());
    }
}
