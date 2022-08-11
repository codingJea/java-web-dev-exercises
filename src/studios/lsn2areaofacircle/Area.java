package studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        double radius = 0;

        System.out.println("Enter the radius of the circle:");

//        Bonus Missions: Add validation to the program.
        while (!validInput) {
            try {
                radius = input.nextDouble();
                validInput = true;

                while (radius <= 0) {
                    System.out.println("\nERROR: Radius must be greater than 0.\n" + "Enter the radius of the circle:");
                    radius = input.nextDouble();
                }
                Double area = Circle.getArea(radius);
                System.out.println("The area of the circle is " + area);
            } catch (InputMismatchException e) {
                System.out.println("\nERROR: Number value required. Program terminated.\n");
                break;
            }
        }
        input.close();
    }
}
