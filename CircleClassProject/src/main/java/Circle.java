/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class Circle {
    private double radius;
    private double pi = 3.14159;

    public Circle(){
    radius = 0;
    }
    
    public Circle(double radius){
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
    double area = pi * radius * radius;
        return area;
    }
      public double getDiameter(){
        double diameter = radius * 2;
        return diameter;
      }     
      public double getCircumference(){
      double circumference = 2 * pi * radius;
      return circumference;
      
      }
}
