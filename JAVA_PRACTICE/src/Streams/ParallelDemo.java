package Streams;

import java.util.*;

public class ParallelDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Sequential stream
        list.stream()
                .forEach(n -> System.out.println("Seq: " + n +
                        " Thread: " + Thread.currentThread().getName()));

        // Parallel stream
        list.parallelStream()
                .forEach(n -> System.out.println("Par: " + n +
                        " Thread: " + Thread.currentThread().getName()));
    }
}