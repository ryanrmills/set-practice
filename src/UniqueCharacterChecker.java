import java.util.HashSet;
import java.util.Set;

/**
 * The UniqueCharacterChecker class provides a method to check if all characters
 * in a given word are unique.
 */
public class UniqueCharacterChecker {

    /**
     * Checks if a given word has all unique characters.
     *
     * @param word the string to be checked for unique characters
     * @return true if all characters in the word are unique; false otherwise
     */
    public static boolean hasUniqueCharacters(String word) {
        // TODO: implement this!
        // Requirement: This must run in O(n) time, where n is the number of characters in the word
        // Hint: Stuck? Consider looking up "charAt" and seeing how it can help you

        /*
         * Solution I'm thinking of is we collect all the unique characters from the word. 
         * If the length of the Set list is different than the length of the word, then 
         * the word does not have all unique characters.
         * 
         * I know it says to use charAt but while I was making the solution 'charAt' never came
         * up as a tool to use.
         */
        
        Set<Character> uniqueChar = new HashSet<>();
        for (char letter : word.toCharArray()){
            uniqueChar.add(letter);
        }

        return word.toCharArray().length == uniqueChar.size();
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        String word3 = "abcdefg";

        System.out.println(word1 + " has unique characters: " + hasUniqueCharacters(word1));
        System.out.println(word2 + " has unique characters: " + hasUniqueCharacters(word2));
        System.out.println(word3 + " has unique characters: " + hasUniqueCharacters(word3));
    }
}
