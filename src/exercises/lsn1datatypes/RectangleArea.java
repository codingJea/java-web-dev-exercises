package exercises.lsn1datatypes;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rectangle's length:");
        Integer length = input.nextInt();

        System.out.println("Enter the rectangle's width:");
        Integer width = input.nextInt();

        Integer area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
