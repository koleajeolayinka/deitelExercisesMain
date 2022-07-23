package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IteratorPractice {
    public static Collection<Integer> unique = new ArrayList<>();
    public static Collection<Integer> collection1 = new ArrayList<>();
    public static Integer[] scores = {2, 4, 5};
    public static List<Integer> list = Arrays.asList(scores);
    public static void main(String[] Okay) {
        runIteratorPractices();

    }

    private static void runIteratorPractices() {
        unique.add(2);
        unique.add(5);
        unique.add(7);
        collection1.add(4);
        collection1.add(4);
        collection1.add(4);
        collection1.add(4);
        collection1.add(4);
//        list.add(5);
//        System.out.println(list);
        collection1.removeIf(element -> unique.contains(element));
        System.out.println("collection -->" + collection1);

    }
}
