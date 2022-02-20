package com.Rozien.array;

public class ArrayDemo01 {
    //变量的类型 变量的名字 = 变量的值
    public static void main(String[] args){
        int[] nums;//1.声明一个数组

        nums = new int[10];//创建一个数组

        int[] nums2 = new int[10];//声明+创建

        //3.给数组元素中赋值
        for (int i = 0; i < nums.length; i++) {
            nums[i]=i+1;

        }
        //计算所有元素的和
        int sum = 0;
        //获取数组长度：数组名.length
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        System.out.print("总和为"+sum);
    }
}
