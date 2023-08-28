package com.forthday;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.max(arrayList);
        Collections.shuffle(arrayList);
        Collections.frequency(arrayList,"1");//统计频率
        ArrayList arrayList1 = new ArrayList(arrayList.size());
        Collections.copy(arrayList1,arrayList);


    }
}
