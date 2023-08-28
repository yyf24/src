package com.thirdday;

import java.util.HashSet;

public class HashSetKuorong {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        for(int i=0;i<100;i++){
            hashSet.add(new A(i));
        }
    }
}
class A{
    private int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}