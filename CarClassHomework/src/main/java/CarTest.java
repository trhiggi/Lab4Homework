/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car(2001, "Ford");
        int i,x;
        
        
        for(i=0; i<=5; i++){
        double speed = myCar.accelerate();
        System.out.println(speed);
        }
        
        for(x=0; x<=5; x++){
        double speed = myCar.brake();
        System.out.println(speed);
        }
    }
 
}
