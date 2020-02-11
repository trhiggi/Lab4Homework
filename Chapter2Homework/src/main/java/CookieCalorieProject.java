import java.util.Scanner;

 
public class CookieCalorieProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Ask the user for the number of cookies they ate
        System.out.println("Please enter the number of cookies you ate.");
        //Obtain the Number of Cookies the user ate via prompt
        double cookiesEaten = keyboard.nextDouble();
        //Do the math for how many calories there are per cookie
        double caloriesPerCookie = 300 /4;
        //Multiply the Calories per cookie by the amount of cookies eaten
        double totalCalories = cookiesEaten * caloriesPerCookie;
        //Display the results to the user
        System.out.println("You ate " + totalCalories + " calories worth of cookies");
    }
}

