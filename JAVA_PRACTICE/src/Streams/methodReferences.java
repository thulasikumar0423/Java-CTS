package Streams;

import java.util.*;
import java.util.Arrays;

public class methodReferences {
    public static void print(String s){
        System.out.println(s);
    }

    void display(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Arrays.asList("Java","Python","Kotlin")
                .forEach(methodReferences::print);
        methodReferences mtr = new methodReferences();
        List<String> list = Arrays.asList("Hello","Welcome");
        list.forEach(mtr::display);
    }
}
