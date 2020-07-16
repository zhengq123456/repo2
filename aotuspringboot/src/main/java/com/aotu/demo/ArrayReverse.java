package com.aotu.demo;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
       /* for (int i = 0; i < len; i++) {
            if (i < len-1-i){
                int temp = arr[i];
                arr[i] = arr[len-1-i];
                arr[len-1-i] = temp;
            }
        }*/

       for (int min = 0,max = len-1;min < max;min++,max--){
           int temp = arr[min];
           arr[min] = arr[max];
           arr[max] = temp;
       }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
