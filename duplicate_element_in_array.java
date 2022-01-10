package com.jlcindia.bookprice.book;

import io.swagger.models.auth.In;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicate_element_in_array {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 20, 40, 50, 40, 60);
        Set<Integer> set = new HashSet<>();
        integers.stream().filter(e->!set.add(e)).forEach(x-> System.out.println(x));

    }

}
