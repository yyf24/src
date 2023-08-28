package com.thirdday;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*HashSet
        * HashSet实现了set的接口
        * HashSet本质是HashMap看无参构造器
        * 不能有重复的元素
        * */
        Set hashSet = new HashSet();
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("ssss"));
        hashSet.remove("john");
        System.out.println(hashSet);
        Set set =new HashSet();
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("Tom"));
        set.add(new Dog("Tom"));
        set.add(new String("hsp"));
        set.add(new String("hsp"));
        set.add(new String("hsp"));
        System.out.println(set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
