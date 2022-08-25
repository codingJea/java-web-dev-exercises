package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

import static exercises.lsn2controlflowandcollections.ArrayPractice.phrase;

import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Create a list with at least 10 integers & call the method on the list
        ArrayList<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(20);
        values.add(25);
        values.add(30);
        values.add(35);
        values.add(40);
        values.add(45);
        values.add(50);
        values.add(50);
        values.add(60);

        System.out.println(sumEven(values));


        ArrayList<String> words = new ArrayList<>();
        words.add("hosts");
        words.add("no");
        words.add("there");
        words.add("hey");
        words.add("bye");
        words.add("hello");

        fiveLetters(words);
        inputLength(words);
        stringToList(phrase);
    }

    // Write a static method to find the sum of the even numbers in an ArrayList
    public static int sumEven(ArrayList<Integer> array) {
        int sum = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }

    // Write a static method to print out each word in a list that has exactly 5 letters
    public static void fiveLetters(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    // Modify the code to prompt the user to enter the word length for the search
    public static void inputLength(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length you'd like to print: ");
        Integer inputLength = input.nextInt();
        for (String word : words) {
            if (word.length() == inputLength) {
                System.out.println(word);
            }
        }
    }

    // BONUS: Instead of creating our own list of words, what if we want to use the
    // string from the Array Practice section? Search “Java convert String to ArrayList”
    // online to see how to split a string into the more flexible ArrayList collection.
    public static void stringToList(String args) {
        String[] strSplit = args.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit)
        );

        for (String s : strList) {
            System.out.println(s);
        }
    }

}
