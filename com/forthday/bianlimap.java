package com.forthday;

import java.util.*;

public class bianlimap {
    public static void main(String[] args) {
        HashMap hashMap =new HashMap();
        hashMap.put(1,2);
        hashMap.put(2,3);
        hashMap.put(3,4);
        Set set =hashMap.keySet();
        Iterator iterator =set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(hashMap.get(next));
        }
       for(Object object:set){
           System.out.println(hashMap.get(object));
       }
        Collection values = hashMap.values();
       //  迭代器   增强for
       Set entryset =hashMap.entrySet();
        System.out.println(entryset);

    }
}
