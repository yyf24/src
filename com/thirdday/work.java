package com.thirdday;

import java.util.HashSet;
import java.util.Objects;

public class work {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add(new employ("a",13));
        hashSet.add(new employ("a",13));
        System.out.println(hashSet);
    }
}
class employ{
    private String name;
    private int age;

    public employ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employ employ = (employ) o;
        return age == employ.age && Objects.equals(name, employ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}