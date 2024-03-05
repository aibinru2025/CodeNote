package com.stream;

import java.util.Random;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-28 17:15
 * @description:
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
