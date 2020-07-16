package com.aotu.demo;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
//        int sum = getSum();
//        System.out.println(sum);
        int result = getMax();
        System.out.println(result);
    }

    public static int getSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public static int getMax() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
