package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 60, 40, 80, 25, 60, 90);
        List<String> names = Arrays.asList("java", "spring", "stream", "api");

        // 1. Filter Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Convert Strings to Uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Strings: " + upperCaseNames);

        // 3. Count Elements Greater Than 50
        long countGreaterThan50 = numbers.stream()
                .filter(n -> n > 50)
                .count();
        System.out.println("Count > 50: " + countGreaterThan50);

        // 4. Find First Element
        Optional<Integer> firstElement = numbers.stream()
                .findFirst();
        System.out.println("First Element: " + firstElement.orElse(null));

        // 5. Sort Numbers (Ascending)
        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ascending Order: " + ascendingOrder);

        // 5. Sort Numbers (Descending)
        List<Integer> descendingOrder = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending Order: " + descendingOrder);

        // 6. Remove Duplicates
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Numbers: " + uniqueNumbers);

        // 7. Sum of Numbers Using Streams
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Numbers: " + sum);

        // 8. Find Max and Min
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Max Value: " + max.orElse(null));
        System.out.println("Min Value: " + min.orElse(null));
    }
}
