
//2. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values 
//of its length and breadth as parameters of its constructor and having a method named 'returnArea' which 
//returns the area of the rectangle. 
//Length and breadth of rectangle are entered through user input through keyboard.
//
// 
//
//Sample Input:
//Enter length
//8
//Enter breadth
//3
//Sample Output :
//Area : 24


package HCL_Training_Constructor;
import java.util.Scanner;

class Area {
    private int length;
    private int breadth;
    
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int returnArea() {
        return length * breadth;
    }
}

public class Area_Of_Rect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length:");
        int length = scanner.nextInt();
        
        System.out.println("Enter breadth:");
        int breadth = scanner.nextInt();
        
        Area rectangle = new Area(length, breadth);
        int area = rectangle.returnArea();
        
        System.out.println("Area: " + area);
        
       
    }
}
