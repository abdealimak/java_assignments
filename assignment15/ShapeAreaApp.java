import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeAreaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose shape (Circle/Rectangle): ");
        String shapeType = sc.next();

        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            if (r <= 0) {
                System.out.println("Radius must be positive.");
                sc.close();
                return;
            }
            shape = new Circle(r);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter length and width: ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            if (l <= 0 || w <= 0) {
                System.out.println("Dimensions must be positive.");
                sc.close();
                return;
            }
            shape = new Rectangle(l, w);
        }

        if (shape != null) {
            System.out.printf("Area: %.2f sq.units\n", shape.calculateArea());
        } else {
            System.out.println("Invalid shape.");
        }
        sc.close();
    }
}