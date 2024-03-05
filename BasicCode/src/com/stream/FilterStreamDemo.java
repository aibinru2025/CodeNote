package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-28 14:47
 * @description: 使用过滤流
 */
public class FilterStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");
        Stream<String> stream = list.stream().filter(
                element -> element.contains("王"));
        stream.forEach(System.out::println);
    }
}

