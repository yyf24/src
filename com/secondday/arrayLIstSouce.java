package com.secondday;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayLIstSouce {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*
        * 1.ArraList维护了一个Object 类型的数组elementData
        * 2.无参构造器，则初始化elementData容量为0，第一次扩容elementData为10，再次扩容为elementData的1.5倍
        * 3.如果直接指定大小的构造器，则初始化elementData容量为指定大小，如果扩容则直接为elementData的1.5倍
        *
        * */
        ArrayList arrayList=new ArrayList(8);
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
    }
}
