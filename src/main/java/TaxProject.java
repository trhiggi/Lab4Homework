
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0762742
 */
public class TaxProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //ask for price from the user
        System.out.println("Please enter the price of the item");
        
        //obtain the price via console
        double price = keyboard.nextDouble();
        
        //calculate State and County tax
        double stateTax = price * 0.04;
        double countyTax = price * 0.02;
        //Display Price, State, and County tax
        System.out.println("The Price was " + price);
        System.out.println("The State Tax was " + stateTax);
        System.out.println("The County Tax was " + countyTax);
        
        //Calulate Total
        double total = price + stateTax + countyTax;
        //display Total
        System.out.println("Your total is " + total);
    }
}
