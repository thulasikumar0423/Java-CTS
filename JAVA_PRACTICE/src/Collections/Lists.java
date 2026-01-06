package Collections;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("mango");
        arrayList.add("cherry");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index: " + arrayList.get(2));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("cat");
        linkedList.add("rat");
        linkedList.add("mat");
        linkedList.add("hat");
        ((LinkedList<String>) linkedList).addFirst("ANt");

        System.out.println("LinkeList: "+ linkedList);

        List<String> vector = new Vector<>();







    }

}
