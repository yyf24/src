package com.thirdday;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class work3 {
    public static void main(String[] args) {
        HashSet hashSet =new LinkedHashSet();
        hashSet.add(new car("奥迪",3000));
        hashSet.add(new car("奥迪",3000));
        System.out.println(hashSet);
    }
}
class car{
    private String name;
    private double price;

    public car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        car car = (car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
