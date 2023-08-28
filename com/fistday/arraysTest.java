package com.fistday;

import java.util.Arrays;
import java.util.Comparator;

public class arraysTest {
    public static void main(String[] args) {
        Integer [] integers ={1,20,2};
        for(Integer i:integers){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(integers));

        Book []b=new Book[4];
        b[0]=new Book("红楼梦",100);
        b[1]=new Book("金瓶梅",90);
        b[2]=new Book("青年文摘",5);
        b[3]=new Book("java从入门到放弃",3000);
        Book.sort(b, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double d1=(double) o1;
                double d2 =(double) o2;
                return (int)(d2-d1);
            }
        });
        for (Book i:b){
            System.out.println(i.toString());
        }

    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void sort (Book[] b,Comparator c){
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-i-1;j++){
                if(c.compare(b[j].getPrice(),b[j+1].getPrice())>0){
                    Book temp =b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}


