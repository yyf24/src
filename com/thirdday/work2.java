package com.thirdday;

import java.util.HashSet;
import java.util.Objects;

public class work2 {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add(new Employ("a",1,new Myday(2011,1,1)));
        hashSet.add(new Employ("a",1,new Myday(2011,1,1)));
        System.out.println(hashSet);
    }
}
class Myday{
    private int year;
    private int month;
    private int day;

    public Myday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Myday myday = (Myday) o;
        return year == myday.year && month == myday.month && day == myday.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "Myday{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
class Employ{
    private String name;
    private double salary;
    private Myday md;

    public Employ(String name, double salary, Myday md) {
        this.name = name;
        this.salary = salary;
        this.md = md;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return Objects.equals(name, employ.name) && Objects.equals(md, employ.md);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, md);
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", md=" + md +
                '}';
    }
}