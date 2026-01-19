package org.example;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

public class SpyTask {

    public static void main(String[] args) {

        // Part 1: verify real method call
        List<String> list = spy(new ArrayList<>());

        list.add("Java");

        verify(list).add("Java");   // verifies real method call

        // Part 2: stub size() but keep real add()
        when(list.size()).thenReturn(10);

        list.add("A");

        System.out.println(list.size()); // OUTPUT: 10
    }
}
