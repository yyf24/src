package com.forthday;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        TreeSet treeSet =new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String) o2);
            }
        });
        treeSet.add("1");
        treeSet.add("2");
    }

}
