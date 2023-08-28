package com.fistday;

import java.util.Arrays;
import java.util.Comparator;

public class arrayTest1 {
    public static void main(String[] args) {
        int array[]={1,-1,8,0,20};
        sort(array);
        sort1(array, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer)o1;
                int i2 =(Integer)o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(array));
        int index =Arrays.binarySearch(array,10);
        System.out.println(index);
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void sort1(int arr[], Comparator c){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(c.compare(arr[j],arr[j+1])>0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
