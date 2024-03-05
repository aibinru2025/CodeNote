package com.str;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:艾宾如
 * @createDate:2024/2/28
 * @description:
 **/
public class TestMap {
    public static void main(String[] args) {
//        List<Student> students=Data.initData();
//        students.stream().map(student -> student.getName()).forEach(System.out::println);

//        List<Student> students=Data.initData();
////        students.stream().map(student -> student.getName()).forEach(System.out::println);
//        //将所有的学生姓名放到list中
//        List<String> studentNames=students.stream().map(student -> student.getName()).collect(Collectors.toList());
//        for (String studentName:studentNames) {
//            System.out.println(studentName);
//        }

        List<Student> students = Data.initData();

        List<Student> studentNames = students.stream().map(student -> {
            if ("赵三".equals(student.getName())) {
                student.setChineseScore(90);
            }
            return student;
        }).collect(Collectors.toList());

        for (Student studentName : studentNames) {
            System.out.println(studentName);
        }
        //打印老的list
        System.out.println("改之前的数据----------------");
        for (Student studentName : students) {
            System.out.println(studentName);
        }
    }

}
