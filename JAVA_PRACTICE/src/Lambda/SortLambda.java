package Lambda;

import java.util.*;


class SortLambda{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9,1);
        list.sort((a,b) -> a - b); //comparator --0, +a comes after b
        System.out.println(list);

        List <String> list1 = Arrays.asList("Virat","Dhoni", "Sachin");
        Collections.sort(list1, (a,b) -> a.compareTo(b));
        System.out.println(list1);

    }
}


