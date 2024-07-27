package JS22S5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
public class SetOperations {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("George");
        list2.add("Kate");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");

        // Union
        Set<String> union = new HashSet<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);

        // Difference (list1 - list2)
        HashSet<String> difference = new HashSet<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference (list1 - list2): " + difference);

        // Difference (list2 - list1)
        HashSet<String> difference2 = new HashSet<>(list2);
        difference2.removeAll(list1);
        System.out.println("Difference (list2 - list1): " + difference2);

        // Intersection
        HashSet<String> set1 = new HashSet<>(list1);
        HashSet<String> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        ArrayList<String> intersection = new ArrayList<>(set1);
        System.out.println("Intersection: " + intersection);
    }
}
