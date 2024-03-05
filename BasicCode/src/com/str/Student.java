package com.str;

/**
 * @author:艾宾如
 * @createDate:2024/2/28
 * @description:
 **/

import java.io.Serializable;

/**
 * 学生类
 * @date 2022/11/30 20:40
 */
public class Student implements Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String schoolClass;

    /**
     *语文成绩
     */
    private Integer chineseScore;
    /**
     * 数学成绩
     */
    private Integer MathScore;

    //省略get、set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Integer getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(Integer chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Integer getMathScore() {
        return MathScore;
    }

    public void setMathScore(Integer mathScore) {
        MathScore = mathScore;
    }
}
