package Streams;
import java.util.*;
public class IntermediateOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .sorted()
                .forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(10,20,30);
        int sum = list1.stream()
                .reduce(0,(a,b) -> a + b);

        System.out.println(sum);



    }
}
