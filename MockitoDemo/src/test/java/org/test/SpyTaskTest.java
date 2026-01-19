package org.test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SpyTaskTest {

    @Test
    void testSpyWithRealAndStubbedMethods() {

        // create spy
        List<String> list = spy(new ArrayList<>());

        // real method call
        list.add("Java");

        // verify real method call
        verify(list).add("Java");

        // stub size()
        when(list.size()).thenReturn(10);

        // real add still works
        list.add("A");

        // assertion
        assertEquals(10, list.size());
    }
}
