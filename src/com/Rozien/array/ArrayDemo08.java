package com.Rozien.array;

import java.util.Arrays;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11   0：没有棋子  1：黑棋  2：白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //输出原始的数组
        System.out.println("输出原始的数组");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("=================");
        //转换为稀疏数组保存
        //遍历二维数组
        //获取有效值个数
        int sum=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数为："+sum);


        //2.创建一个稀疏数组的数组

        int[][] array2 = new int[sum+1][3];
        //sum+1: 头部第一行储存 行数、列数、有效值个数
        //3： 横坐标 纵坐标 对应的有效值


        //先定义头部
        array2[0][0] = 11; //行数
        array2[0][1] = 11; //列数
        array2[0][2] = sum;//有效值个数


        //遍历二维数组，将非零的值，存放到稀疏数组中
        //array1[i].length ：是二维数组里第i行的长度，也就是有几列
        //遍历二维数组，要走遍他的每一行每一列
        //第一层循环，走每一行：i< array1.length
        //第二层循环，走每一列：j< array1[i].length
        int count = 0;//有效值个数
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;//横坐标
                    array2[count][1] = j;//纵坐标
                    array2[count][2] = array1[i][j];//具体有效值
                }

            }
        }
        //输出稀疏数组
        System.out.println("稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]+"\t");
        }
        System.out.println("=======================" );

        //还原稀疏数组
        System.out.println("还原");

        //1.读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        //2.给其中的元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
            //还原数组[有效值的横坐标][有效值的纵坐标] = 有效值具体值

        }
        //3.打印
        System.out.println("输出还原的数组");

        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }


    }
}