package com.secondday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_ {
    public static void main(String[] args) {
        /*
         * 1.List集合元素是有序的，添加顺序和去除顺序一致并且可以重复
         * 2.List每个元素都有对应索引
         * 3.
         *
         *
         *
         *
         *
         * */
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        list.add(1,"韩顺平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(7,"三国演义");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
    }
}
