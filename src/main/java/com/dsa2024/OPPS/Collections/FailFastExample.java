package com.dsa2024.OPPS.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Structural modification: adding an element while iterating
            list.add("D"); // This will throw ConcurrentModificationException
        }
    }
}

