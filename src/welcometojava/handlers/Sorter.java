package welcometojava.handlers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Handles sorting operations.
 * Demonstrates anonymous Comparator class.
 */
public class Sorter {
    public static void handleSorting() {
        List<Integer> nums = Arrays.asList(5, 1, 9, 3, 7);
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) { return b - a; }
        });
        System.out.println("Descending order: " + nums);
    }
}
