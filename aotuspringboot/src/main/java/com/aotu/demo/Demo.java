package com.aotu.demo;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(getSum(10,20));
        String[] str = new String[3];
//        System.out.println(str[0]);
        char[] array= new char[3];
        System.out.println(array[0]);//  /u0000
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static int getSum(int a,int b){
        if (a>b){
            return a;
        }
        return b;
    }
}
