package com.secondday;

import java.util.ArrayList;

public class work2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList arrayList =new ArrayList();
        arrayList.add(new book("红楼梦","曹雪芹",100));
        arrayList.add(new book("西游记","吴承恩",10));
        arrayList.add(new book("三国演义","罗贯中",80));
        arrayList.add(new book("水浒传","施耐庵",9));
        for(int i=0;i<arrayList.size()-1;i++){
            for(int j=0;j<arrayList.size()-i-1;j++){
                book b1 = (book)arrayList.get(j);
                book b2 = (book)arrayList.get(j+1);
                if (b1.getPrice()>b2.getPrice()){
                    arrayList.set(j,b2);
                    arrayList.set(j+1,b1);
                }
            }
        }
        for (Object obj:arrayList
             ) {
            System.out.println(obj);
        }
    }
}
class book{
    private String nameg;
    private  String auother;
    private int price;

    public String getNameg() {
        return nameg;
    }

    public void setNameg(String nameg) {
        this.nameg = nameg;
    }

    public String getAuother() {
        return auother;
    }

    public void setAuother(String auother) {
        this.auother = auother;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public book(String nameg, String auother, int price) {
        this.nameg = nameg;
        this.auother = auother;
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "nameg='" + nameg + '\'' +
                ", auother='" + auother + '\'' +
                ", price=" + price +
                '}';
    }
}
