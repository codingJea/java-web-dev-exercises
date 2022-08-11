package studios.lsn3countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void CountChars(String quote) {
//        String quote = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms " +
//                "over to one side, you can put the quadratics into a form " +
//                "that can be factored allowing that side of the equation to " +
//                "equal zero. Once you’ve done that, it’s pretty straightforward " +
//                "from there.";

//        Create a HashMap to hold each letter + its count
        HashMap<Character, Integer> letters = new HashMap<>();


//        Bonus: Make the character counts case-insensitive
        quote = quote.toUpperCase();

//        Bonus: Exclude non-alphabetic characters
        quote = quote.replaceAll("\\W", "");

//       Add each character to the HashMap & update the count
        for (int i = 0; i < quote.length(); i++) {
            if (letters.containsKey(quote.charAt(i))) {
                letters.put(quote.charAt(i), letters.get(quote.charAt(i)) + 1);
            } else {
                letters.put(quote.charAt(i), 1);
            }
        }

//        System.out.println(letters);

//        Print the entry & make it pretty
        for (Map.Entry<Character, Integer> count : letters.entrySet()) {
            System.out.println(String.format("%s: %s", count.getKey(), count.getValue()));
        }
    }
}
