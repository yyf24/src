package com.forthday;

import java.sql.Array;
import java.util.ArrayList;

public class homework1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新闻一","新馆确诊病例超过千万，数百万印度教徒奔赴恒河\"圣浴\"引得民众担忧"));
        arrayList.add(new News("新闻二","男子突然记起两个月前的鱼还在网兜里"));
    }
}
class News{
    private String title;
    private String neirong;

    public News(String title, String neirong) {
        this.title = title;
        this.neirong = neirong;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    @Override
    public String toString() {
        return title;
    }
}
