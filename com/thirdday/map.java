package com.thirdday;

import java.util.*;

public class map {
    public static void main(String[] args) {
        /*
        1.Map与Collection并列存在，保存具有映射关系的数据，key-value（双列元素）
        2.key和value可以是任何数据类型，会封装到HashMap@node对象中
        3.Map中的key不许重复
        4.map中的value是可以重复的
        5.key可以是null，只能有一个
        6.常用String类作为key
         */
        HashMap hashMap = new HashMap();
        hashMap.put("no1","韩顺平");
        hashMap.put("no2","张无忌");
        hashMap.put("no1","原亚夫");
        System.out.println(hashMap);
        Set set =new HashSet();

        List list =new ArrayList();
        list.add(new Integer(182));
        list.add(new Integer(182));

        set.addAll(list);
        System.out.println(set);

    }
}
