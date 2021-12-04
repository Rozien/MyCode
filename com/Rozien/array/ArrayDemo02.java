package com.Rozien.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化 :创建+赋值
        int a[] = {1,2,3,4,5};

        //动态初始化 ：包含默认初始化(默认值为0)
        int[] b = new int[10];
        b[0] = 13;
        System.out.println(b[0]);
        System.out.println(b[1]);

    }
}
