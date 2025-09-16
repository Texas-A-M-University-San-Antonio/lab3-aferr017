
import java.util.Scanner;

public class Lab3_Abigail_Ferrer
{
    public static void main(String[] args) 
    {
        // initial_value, interest_rate, final_home_value are doubles & elapsed_years is int

        Scanner input = new Scanner(System.in); // declare scanner

        System.out.println("Please Enter the inital value of the home: ");
        
        double initial_value = input.nextDouble();
        
        System.out.println("Please Enter the number of elapsed years: ");

        int elapsed_years = input.nextInt(); //like nextDouble, i used nextInt for this integer variable

        System.out.println("Please Enter the interest rate: ");

        double interest_rate = input.nextDouble() * 0.01; // i went ahead and caluclated the decimal value of the interest rate

        double  final_home_value = initial_value * Math.pow(1 + interest_rate, elapsed_years); //i realized i had to use Math.pow when i saw the ^ symbol !!

        System.out.println("The Final Home Value is: " + final_home_value);
        
        input.close();

    
    }
}