package com.aotu.demo;

import java.util.ArrayList;
import java.util.Random;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = demo01();
        ArrayList<Integer> smallList = getSmallList(arrayList);
        printList(arrayList);
        printList(smallList);
    }

    public static ArrayList<Integer> demo01(){
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            arrayList.add(num);
        }
        return arrayList;
//        printList(arrayList);
    }

    public static void demo02(){
        Student zhangsan = new Student("zhangsan", 3);
        Student lisi = new Student("lisi", 4);
        Student wangwu = new Student("wangwu", 5);

        ArrayList<Student> list= new ArrayList<>();
        list.add(zhangsan);
        list.add(lisi);
        list.add(wangwu);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String name = student.getName();
            int age = student.getAge();
            System.out.println(name+","+age);
        }
    }

    public static void printList(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (i == (list.size()-1)){
                System.out.println(o+"}");
            }else{
                System.out.print(o+" @ ");
            }

        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> arrayList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer num = arrayList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
