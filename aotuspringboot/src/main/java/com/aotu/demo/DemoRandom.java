package com.aotu.demo;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
       /* for (int i = 0; i < 100; i++) {
            int num = getRandom(10);
            System.out.print(num+",");
        }*/
       guessGame();
    }

    public static int getRandom(int n){
        Random r = new Random();
        int num = r.nextInt(n)+1;
        return num;
    }

    public static void guessGame(){
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请猜:");
            int i = sc.nextInt();
            if (i == num){
                System.out.println("猜对了");
                break;
            }else if (i > num){
                System.out.println("大了");
            } else if (i < num) {
                System.out.println("小了");
            }
        }
    }
}
