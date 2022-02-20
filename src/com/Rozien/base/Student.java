package com.Rozien.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String age;
    private String name;
    private String id;
    private String address;

    public Student(String age, String name, String id, String address) {
        super();
        this.age = age;
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void findOutAll(String filename) throws Exception{
        ArrayList<Student> array=new ArrayList<Student>();
        readDate(filename, array);
        if(array.size()==0)
            System.out.println("该系统还没有学生");
        else {
            System.out.println("学号\t姓名\t\t年龄\t地址");
            for(int i=0;i<array.size();i++){
                Student s=array.get(i);
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
            }
        }
    }
    public static void writeDate(String filename,ArrayList<Student> array) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(filename));
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            StringBuilder ch=new StringBuilder();
            ch.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress()).append(",");
            bw.write(ch.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
    public static void readDate(String filename,ArrayList<Student> array) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String ch;
        while((ch=br.readLine())!=null){
            Student s=new Student();
            String[] sc=ch.split(",");
            s.setId(sc[0]);
            s.setName(sc[1]);
            s.setAge(sc[2]);
            s.setAddress(sc[3]);
            array.add(s);
        }
        br.close();
    }
    public static void addSomeone(String filename) throws IOException{
        ArrayList<Student> array=new ArrayList<Student>();
        readDate(filename, array);
        System.out.println("请输入你想加入学生的学号");
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();
        boolean flag=false;
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getId().equals(id)){
                flag=true;
            }
        }
        if(flag)
            System.out.println("该系统已有此学生,请重新选择操作");
        else{
            System.out.println("请输入学生的姓名");
            String name=scanner.nextLine();
            System.out.println("请输入学生的年龄");
            String age=scanner.nextLine();
            System.out.println("请输入学生的地址");
            String address=scanner.nextLine();
            Student s=new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.add(s);
            writeDate(filename, array);
            System.out.println("已成功添加该学生！");
        }

    }
    public static void deleteSomeone(String filename) throws IOException{
        ArrayList<Student> array=new ArrayList<Student>();
        readDate(filename, array);
        System.out.println("请输入你想删除学生的学号");
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getId().equals(k))
                index=i;
        }
        if(index==-1)
            System.out.println("系统中不存在该学号的学生。");
        else {
            array.remove(index);
            writeDate(filename, array);
            System.out.println("已成功删除该学生！");
        }
    }
    public static void reviseSomeone(String filename) throws IOException {
        ArrayList<Student> array=new ArrayList<Student>();
        readDate(filename, array);
        System.out.println("请输入你要修改的学生学号");
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getId().equals(id))
                index=i;
        }
        if(index!=-1)
        {
            System.out.println("请输入修改后的姓名");
            String name=scanner.nextLine();
            System.out.println("请输入修改后的年龄");
            String age=scanner.nextLine();
            System.out.println("请输入修改后的地址");
            String address=scanner.nextLine();
            Student s=new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index,s);
            writeDate(filename, array);
            System.out.println("修改成功！");
        }
        else System.out.println("没有该学生");
    }
    public static void main(String[] args) throws Exception {
        //TODO：filename是文件存放路径
        String filename="text.txt";
        ArrayList<Student> array=new ArrayList<Student>();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("-------欢迎来到教学系统-------");
            System.out.println("1.查看所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            int k=scanner.nextInt();
            switch(k)
            {
                case 1:findOutAll(filename);break;
                case 2:addSomeone(filename);break;
                case 3:deleteSomeone(filename);break;
                case 4:reviseSomeone(filename);break;
                case 5:System.out.println("谢谢您的使用");flag=false;break;
                default:System.out.println("您的输入有误，请重新输入");flag=false;break;
            }
        }
    }
}
