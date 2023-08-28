package com.fistday;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("用户名：");
        String name =sc.nextLine();
        System.out.print("密码：");
        String pasword=sc.nextLine();
        System.out.print("邮箱：");

        String youxiang = sc.nextLine();
        if(!(name.length()>=2&&name.length()<=3)){
            throw new RuntimeException("用户名不对");
        }
        if(!(pasword.length()==6&&isDigital(pasword))){
            throw new RuntimeException("密码不对");
        }
        if(!(pasword.contains("@")&&pasword.contains(".")&&pasword.indexOf('@')<pasword.indexOf('.'))){
            throw new RuntimeException("邮箱不对");
        }




    }
    static Boolean isDigital(String s){
        try {
            Integer.valueOf(s);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
