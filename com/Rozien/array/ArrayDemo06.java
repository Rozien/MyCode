package com.Rozien.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {


        int[] a = {2,213,4,12,123,5,123,3456};
        System.out.println(a);//[I@1b6d3586

        //打印元素数组 (Arrays.toString(a))
        System.out.println(Arrays.toString(a));

        //数组排序：升序 Arrays.sort(a)
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //数组填充 Arrays.fill(a,int)
        Arrays.fill(a,13);
        System.out.println(Arrays.toString(a));


    }
}