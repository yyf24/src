package com.thirdday;

import java.util.HashSet;
import java.util.Set;

public class set_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*set接口基本介绍
        * 无需没有索引
        * 不允许重复元素，最多包含一个null
        * 添加和取出的顺序不一致
        *
        *
        * 可以使用迭代器
        * 增强for
        * 不能使用索引的方式来获得
        * */
        Set set =new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());


    }
}
