package com.fistday;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        System.out.println("请输入字符串");
        Scanner sc =new Scanner(System.in);
        String S =sc.next();
        int start =sc.nextInt();
        int end= sc.nextInt();
        System.out.println(reve(S,start,end));
    }
    public static String reve(String s,int start,int end){
        if(!(s!=null&&start>0&&end<s.length()&&start>end)){
            throw new RuntimeException("参数不正确");
        }
        char []c=s.toCharArray();
        for(int i=0;i<=(end-start)/2;i++){
            char temp=c[end-i];
            c[end-i]=c[start+i];
            c[start+i]=temp;
        }
        return String.valueOf(c);
    }
}
