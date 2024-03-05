package com.stream.demo01;

/**
 * @author:艾宾如
 * @createDate:2024/2/28
 * @description:
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/11/30 22:43
 */
public class Data {
    public static List<Student> initData(){
        List<Student> students= new ArrayList<>();
        Student s1=new Student();
        s1.setName("王五");
        s1.setSchoolClass("一年级");
        s1.setChineseScore(100);
        s1.setMathScore(100);
        students.add(s1);

        Student s2=new Student();
        s2.setName("李四");
        s2.setSchoolClass("一年级");
        s2.setChineseScore(100);
        s2.setMathScore(100);
        students.add(s2);

        Student s3=new Student();
        s3.setName("李思");
        s3.setSchoolClass("二年级");
        s3.setChineseScore(100);
        s3.setMathScore(100);
        students.add(s3);

        Student s4=new Student();
        s4.setName("王五");
        s4.setSchoolClass("三年级");
        s4.setChineseScore(100);
        s4.setMathScore(100);
        students.add(s4);

        Student s5=new Student();
        s5.setName("赵三");
        s5.setSchoolClass("一年级");
        s5.setChineseScore(100);
        s5.setMathScore(100);
        students.add(s5);
        return students;
    }
}
