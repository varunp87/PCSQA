package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class UniqueElementsFromTwoArraya {

    public static void main(final String[] args) {
        final List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = new int[] { 5, 6, 7, 8 };

        //final List<Integer> list1 = Arrays.asList(arr1);


        final Set<Integer> set1 = new HashSet<>(list1);

        final List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        final Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2); // Keep union.
        System.out.println("s1"+set1+" ");

        // Remove union to keep only unique items.
        list1.removeAll(set1);
        System.out.println("l1"+list1+" ");
        list2.removeAll(set1);

        // Accumulate unique items.
        list1.addAll(list2);

        System.out.println(new HashSet<>(list1));
        // [1,2,3,4,7,8]
    }
}
