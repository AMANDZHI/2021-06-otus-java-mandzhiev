package ru.otus;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<Integer> numbers = Lists.newArrayList(3, 6, 7, 1);
        System.out.println(numbers);
        System.out.println(Lists.reverse(numbers));
    }
}
