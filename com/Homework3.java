package com;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        hashMap.replace("jack",2600);
        for(Object object: hashMap.keySet()){
            hashMap.replace(object,(Integer)hashMap.get(object)+100);
        }
        System.out.println(hashMap);
        Set entry =hashMap.entrySet();
        Iterator iterator=entry.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
           System.out.println(((Map.Entry)next).getKey());
        }
        Collection value =hashMap.values();
        Iterator iterator1 =value.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
    }
}
