package Figures;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 3);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        rectangle.resize(3);

        System.out.println("\nResized Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        //In the activity it did not mention that the triangle had to be resized, it just printed it normally
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

    }
}