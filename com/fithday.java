package com;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class fithday {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car;
        arrayList.add(car=new Car("宝马",4000));
        arrayList.add(new Car("宾利",500000));
        arrayList.remove(car);
        arrayList.add(car);
        arrayList.contains(car);
        System.out.println(arrayList.isEmpty());
        arrayList.addAll(arrayList);
        arrayList.containsAll(arrayList);
        arrayList.removeAll(arrayList);






    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
