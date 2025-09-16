/**
 * Name: [Abigail Ferrer]
 * Date: [Enter Today's Date]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Abigail_Ferrer
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:

        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.println("Please Enter the Length of the side of a cube: ");

        // Step 2: Read the user's input and store it in a variable.
        double length = input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        double volume = Math.pow(length, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        double surface_area = 6 * Math.pow(length, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences
        System.out.println("The volume of the cube is: " + volume);
        System.out.println("The surface area of the cube is: " + surface_area);
    }
}