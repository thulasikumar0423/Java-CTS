package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Pyhton","J@EE");

        List<String> result =
                names.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
