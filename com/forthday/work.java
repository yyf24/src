package com.forthday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,new employ("1",123000,1));
        hashMap.put(2,new employ("2",12456,2));
        hashMap.put(3,new employ("3",125,3));

        Set set = hashMap.keySet();
        Iterator iterator =set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            employ e =(employ) hashMap.get(next);
            if(e.getSalary()>18000){
                System.out.println(e);
            }
        }
        Set set1 = hashMap.entrySet();
        for(Object object:set1){
            Map.Entry entry=(Map.Entry) object;
            employ e =(employ) entry.getValue();
            if (e.getSalary()>18000){
                System.out.println(e);
            }
        }
    }
}
class employ{
    private String name;
    private double salary;
    public  int id;

    public employ(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employ{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}