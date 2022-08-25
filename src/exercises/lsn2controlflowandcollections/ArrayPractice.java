package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static String phrase = "I would not, could not, in a box. " +
            "I would not, could not with a fox. " +
            "I will not eat them in a house. " +
            "I will not eat them with a mouse.";

    public static void main(String[] args) {
        // Create & initialize an array in a single line
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Loop through the array & print out each value
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        // Modify the loop to only print the odd numbers
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }

        }


        // Use the split method to divide the string at each space
        // & store the individual words in an array
        String[] words = phrase.split(" ");

        // Print the array of words
        System.out.println(Arrays.toString(words));

        // Change the delimiter to split the string into separate sentences & store them in an array.
        // Print the array of sentences
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}