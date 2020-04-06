
import java.util.Scanner;


public class CircleTest {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter the radius of the your circle");
        double radius = keyboard.nextDouble();
       
        Circle myCircle = new Circle(radius);
        
        double area = myCircle.getArea();
        System.out.println("The area of your circle is " + area);
        
        double diameter = myCircle.getDiameter();
        System.out.println("The diameter of your circle is " + diameter);
        
        double circumference = myCircle.getCircumference();
        System.out.println("The circumference of your circle is " + circumference);
        
    }
}
