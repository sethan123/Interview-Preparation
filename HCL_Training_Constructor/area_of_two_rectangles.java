
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by 
//creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and
//breadth passed as parameters to its constructor.
//Sample Output :
//Area : 20 Perimeter is 18
//Area : 40 Perimeter is 26

package HCL_Training_Constructor;

class Rectangle {
    private int length;
    private int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getArea() {
        return length * breadth;
    }
    
    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class area_of_two_rectangles {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        int area1 = rectangle1.getArea();
        int perimeter1 = rectangle1.getPerimeter();
        System.out.println("Area: " + area1 + " Perimeter is " + perimeter1);
        
        Rectangle rectangle2 = new Rectangle(5, 8);
        int area2 = rectangle2.getArea();
        int perimeter2 = rectangle2.getPerimeter();
        System.out.println("Area: " + area2 + " Perimeter is " + perimeter2);
    }
}
