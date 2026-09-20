import java.util.Scanner;

class Vehicle {
    public void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with push-button ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self-start.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Bike): ");
        String type = sc.next();

        Vehicle v; // Vehicle reference demonstrating polymorphism
        if (type.equalsIgnoreCase("Car")) {
            v = new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            v = new Bike();
        } else {
            v = new Vehicle();
        }

        v.start();
        sc.close();
    }
}