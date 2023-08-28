package com.forthday;

import java.util.HashMap;
import java.util.HashSet;

public class hashmap_xiaojie {
    public static void main(String[] args) {
        /*
        * 1.HashMap常用类Hashmap Hashtable
        * 2.HashMap是Map接口使用频率最高的类
        * 3.HashMap是以key-value的键值对的形式存放的
        *
        * 4.key不能重复，value可以，可以null
        * 5.如果添加相同的key会覆盖原来的key-value
        * 6.与hashset一样不保证映射顺序
        * 7.HashMap没有实现线程同步
        *
         */
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        System.out.println(hashSet.add("1"));

        HashMap hashMap = new HashMap();
        hashMap.put("1",2);
        System.out.println(hashMap.put("1",3));
        /*
        *HashMap底层维护Node类型的数组table,默认为null
        * 创建对象是加载因子初始化为0.75 loadfactor
        * 当添加key-value是，判断key的hash索引在table处是否有元素，没有直接创建，如果有判断是否相等，如果相等替换value，如果不相等看链表后面
        * 如果链表长度为8扩容，
        * 第一次添加，table.length=8,threshold=12
        * 以后扩容扩大到原来的两倍
        *
        *
        *
        *
        *
         */

    }
}
