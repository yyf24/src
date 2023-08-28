package com.fistday;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        int[ ] src={1,2,3};
        int []dest =new int[3];
        System.arraycopy(src,1,dest
        ,2,1);
        System.out.println(Arrays.toString(dest));
        System.out.println(System.currentTimeMillis());
    }

}
