import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> letternummap = new HashMap<>();

        for (int i = 0; i < alphabet.length; i++) {
            letternummap.put(alphabet[i], i+1);
        }
        return letternummap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {

        int sq;
        Map<Integer, Integer> squaremap = new HashMap<>();

        for (int i: nums) {
            sq = i * i;
            squaremap.put(i, sq);
        }
        return squaremap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> word_counts = new HashMap<>();

        Set word_set = new HashSet<>(words);

        for (Object w: word_set) {
            word_counts.put(w.toString(), 0);
        }

        for (String word: words) {
            word_counts.put(word, word_counts.get(word) + 1);
        }

        return word_counts;
    }
}
