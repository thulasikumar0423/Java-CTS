package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Sita","Sam","AJay");
        Map<Integer, List<String>> map =
                names.stream()
                        .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
