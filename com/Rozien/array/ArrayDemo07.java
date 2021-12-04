package com.Rozien.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {3,12,34,234,123,13};
        System.out.println(Arrays.toString(a));
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));



    }


    /*冒泡排序
    1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
    2.每一次比较，都会产生出一个最大或最小的数字
    3.下一次则可以少一次排序！
    4.依次循环，直到结束！
     */
    public static int[] sort(int[] a){
        //临时变量
        int temp = 0;

        //外层循环, 判断我们这个循环要走几次
        for (int i = 0; i < a.length-1; i++) {
            //内层循环， 比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j+1] > a[j]){
                    //交换操作 （三个杯子两瓶水）
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}