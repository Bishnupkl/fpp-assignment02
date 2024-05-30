package Prog5;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
        while (true) {
            String shapes = """
                    Enter C for Circle
                    Enter R for Rectangle
                    Enter T for Triangle
                    """;
            System.out.println(shapes);
            String choice = input.next().toUpperCase();
            switch (choice) {
                case "R":
                    System.out.println("Enter the width of the Rectangle: ");
                    double widthRec = input.nextDouble();
                    System.out.println("Enter the height of the Rectangle: ");
                    double heightRec = input.nextDouble();
                    Rectangle rectangle = new Rectangle(widthRec, heightRec);
                    System.out.println("The area of Rectangle is: " + rectangle.computeArea());
                    break;
                case "T":
                    System.out.println("Enter the height of the triangle: ");
                    double heightTria = input.nextDouble();
                    System.out.println("Enter the base of the triangle: ");
                    double baseTria = input.nextDouble();
                    Triangle triangle = new Triangle(heightTria, baseTria);
                    System.out.println("The area of Triangle is: " + triangle.computeArea());
                    break;
                case "C":
                    System.out.println("Enter the radius of the Circle: ");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("The area of Circle is: " + circle.computeArea());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to continue(y/n)?");
            String decision = input.next();
            if (!decision.toLowerCase().equals("y")) {
                break;
            }
        }

        input.close();
    }
}
