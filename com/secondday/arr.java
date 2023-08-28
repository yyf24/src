package com.secondday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class arr {


    @SuppressWarnings("all")
    public static void main(String[] args) {
        //为了解决数组扩容的问题，数组操作不方便
        //集合主要分两大类
        //1.集合分两组（单列结合，双列集合）
        /*
         *collection 单列集合，两个重要接口，List Set
         * map 是双列集合 存放k-v
         *
         *
         *
         *
         * */
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add(0);
        arrayList.add(true);
        Iterator iterator =arrayList.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
        iterator=arrayList.iterator();


    }


}
