package com.fistday;

import java.util.Scanner;

public class stringbuffertest {
    public static void main(String[] args) {
//        String s = null;
//        StringBuffer sb = new StringBuffer();
//        sb.append(s);
//        System.out.println(sb);
//        StringBuffer sb1 = new StringBuffer(s);
//        System.out.println(sb1);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb =new StringBuffer(s);
        try {
            double d = Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("输入错误");
        }
        int n = sb.indexOf(".");
        while(true){
            if(n-3<=0){
                break;
            }
            n=n-3;
            sb.insert(n,',');

        }
        System.out.println(sb);

    }

}
