package Collections;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("yellow");

        System.out.println("HashSet: "+ hashSet);

        Set<String> lset= new LinkedHashSet<>();
        lset.add("First");
        lset.add("second");
        lset.add("third");

        System.out.println("LinkedHashSet: "+ lset);

        Set<Integer> tset= new TreeSet<>();
        tset.add(10);
        tset.add(20);
        tset.add(70);

        System.out.println("TreeSet: "+ tset);


        NavigableSet<Integer> nset = (TreeSet<Integer>) tset;
        System.out.println("First: "+ nset.first());
        System.out.println("Last: "+ nset.last() );
        System.out.println("Lower than 50: " + nset.lower(50));
        System.out.println("Higher than 50: " + nset.higher(50));
        System.out.println("Descending : "+ nset.descendingSet());
    }
}
