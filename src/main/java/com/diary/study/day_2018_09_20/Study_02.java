package com.diary.study.day_2018_09_20;

import java.util.HashMap;
import java.util.Map;

/**
 * 遍历map
 */
public class Study_02 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "小明");
        map.put(2, "小明1");
        map.put(3, "小明2");
        map.put(4, "小明3");

        map.forEach((k, v) -> {
            System.out.println(k + "->" + v);
        });
    }
}
