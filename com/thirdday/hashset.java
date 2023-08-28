package com.thirdday;

import java.time.Period;
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet<>();
        Peson p=new Peson("AA",1001);
        hashSet.add(p);
        System.out.println(hashSet);
        p.setName("cc");
        System.out.println(hashSet);
    }
}
class Peson{
    private String name;
    private int id;

    public Peson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peson peson = (Peson) o;
        return id == peson.id && Objects.equals(name, peson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
