package com.secondday;

import java.util.ArrayList;
import java.util.Iterator;

public class work {
    public static void main(String[] args) {
        ArrayList arrayList =new ArrayList<>();
        arrayList.add(new Dog("a",1));
        arrayList.add(new Dog("b",2));
        arrayList.add(new Dog("c",3));
        for(Object obj:arrayList){
            System.out.println(obj);
        }
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
