package com.diary.study.day_2018_09_20;

import com.diary.study.day_2018_09_20.entity.People.People;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除list中指定的元素
 */
public class Study_01 {

    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People(1, "小明"));
        list.add(new People(2, "小明"));
        list.add(new People(3, "小黑"));
        list.add(new People(4, "小花"));

        // 遍历删除数组中的指定元素
        list.removeIf(people -> people.getName().equals("小明"));

        list.forEach(System.out::println);


    }
}
