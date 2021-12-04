package com.Rozien.array;

import java.util.concurrent.ForkJoinPool;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //二维数组双循环
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }

        }

    }
}