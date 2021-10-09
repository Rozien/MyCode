package com.array.test;

import java.util.Scanner;

class demo03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num=sc.nextInt();                //输入学生人数
        int[] score=new int[num];            //创建数组，存放学生成绩

        int sum=0;
        for(int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            score[i]=sc.nextInt();           //录入成绩
            sum += score[i];                 //累加到sum，计算总分
        }
        System.out.println("总分为："+sum);   //输出总分
        double avg=sum/num;                 //计算平均分
        System.out.println("平均分为："+avg); //输出平均分

        int max=score[0];
        int min=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){               //判断哪个数是最高分
                max=score[i];
            }
            if(score[i]<min){               //判断哪个数是最低分
                min=score[i];
            }
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        }
    }


