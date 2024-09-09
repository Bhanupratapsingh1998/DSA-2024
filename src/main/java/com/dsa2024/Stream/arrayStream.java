package com.dsa2024.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream {
    public static void main(String[] args) {
        Integer num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Stream<Integer> stream = Arrays.stream(num);
        stream.filter(e -> e > 5).forEach(e -> System.out.println(e));
    }
}
