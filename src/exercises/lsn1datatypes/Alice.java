package exercises.lsn1datatypes;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Search for a term within the string:");
        String term = input.nextLine();

        firstSentence = firstSentence.toLowerCase();
        term = term.toLowerCase();

        Boolean result = firstSentence.contains(term);

        Integer index = firstSentence.indexOf(term);
        Integer length = term.length();
        String newSentence = firstSentence.replace(term, "");

        if(result) {
            System.out.println(true);
            System.out.println("Your term first appears at index " + index +
                    ". Your term is " + length + " characters long.");
            System.out.println(newSentence);
        } else {
            System.out.println(false);
        }



    }
}
