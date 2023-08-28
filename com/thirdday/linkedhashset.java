package com.thirdday;

import java.util.Set;
import java.util.LinkedHashSet;

public class linkedhashset {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*
        LinkedHashset是HashSet的子类
        LinkedHashSet 的底层是LinkedHashMap，底层维护了一个数组+双向链表
        LinkedHashSet根据HashCode来决定元素的存储位置，同时使用链表维护元素的次序
        LinkedHashSet不允许添加重复元素
         */
        Set set =  new LinkedHashSet();
        set.add("”");
        set.add(123);
        set.add("Hsp");
        set.add(123);

    }

}
