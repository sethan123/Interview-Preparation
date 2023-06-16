package HCL_Training_Constructor_Overloading1;

public class Main {

	public static void main(String[] args) {
		

		Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }

}
