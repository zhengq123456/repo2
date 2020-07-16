package com.aotu.demo;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {13,3,5,67,1,3,54,32,53,12,57,89,3,6,1};
//        1,1,3,3,3,5,6,12,13,32,53,54,57,67,89,
//        selectSort(array);
        bubblingSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }
//选择排序
    public static void selectSort(int[] array){
        for (int x = 0; x < array.length-1; x++) {

            int min = x;

            for (int y = x+1; y < array.length; y++) {
                if (array[min] > array[y]){
                    min = y;
                }
            }

            int temp = array[x];
            array[x] = array[min];
            array[min] = temp;

        }
    }

//冒泡排序
    public static void bubblingSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int x = 0; x < array.length-i-1; x++) {
                if (array[x] > array[x+1]){
                    int temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
        }
    }

}
