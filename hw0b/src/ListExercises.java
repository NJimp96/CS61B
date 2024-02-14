import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int list_sum = 0;

        for (int i: L) {
            list_sum += i;
        }
        return list_sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {

        List<Integer> evens_list = new ArrayList<>();

        for (int i: L) {
            if (i % 2 == 0) {
                evens_list.add(i);
            }
        }
        return evens_list;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> intersection = new ArrayList<>();

        for(int i: L1) {
            for (int j: L2) {
                if (i == j) {
                    intersection.add(i);
                }
            }
        }

        return intersection;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count_char = 0;

        for (String i: words) {
            for (int j = 0; j < i.length(); j++){

                if (c == i.charAt(j)) {
                    count_char += 1;
                }
            }
        }

        return count_char;
    }
}
