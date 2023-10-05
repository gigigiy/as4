import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Choose a shape type:");
                    System.out.println("1. Rectangle");
                    System.out.println("2. Circle");
                    System.out.println("3. Triangle");
                    System.out.println("4. Square");
                    System.out.println("5. Exit");

                    int choice = scanner.nextInt();

                    if (choice == 5) {
                        break;
                    }

                    Shape shape = null;

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the width of the rectangle: ");
                            double width = scanner.nextDouble();
                            System.out.print("Enter the height of the rectangle: ");
                            double height = scanner.nextDouble();
                            shape = new Rectangle("Rectangle", width, height);
                            break;
                        case 2:
                            System.out.print("Enter the radius of the circle: ");
                            double radius = scanner.nextDouble();
                            shape = new Circle("Circle", radius);
                            break;
                        case 3:
                            System.out.print("Enter the length of side 1 of the triangle: ");
                            double side1 = scanner.nextDouble();
                            System.out.print("Enter the length of side 2 of the triangle: ");
                            double side2 = scanner.nextDouble();
                            System.out.print("Enter the length of side 3 of the triangle: ");
                            double side3 = scanner.nextDouble();
                            shape = new Triangle("Triangle", side1, side2, side3);
                            break;
                        case 4:
                            System.out.print("Enter the length of the square: ");
                            double side = scanner.nextDouble();
                            shape = new Square("Square", side);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }

                    if (shape != null) {
                        System.out.println("Shape: " + shape.name);
                        System.out.println("Area: " + shape.getArea());
                        System.out.println("Perimeter: " + shape.getPerimeter());
                    }
                }
            }
        }


