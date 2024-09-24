package com.management;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 启动
 */
public class StudentSystem {
    static ArrayList<Student> students=new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------管理系统---------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.查询学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入选择：");
            Scanner sc=new Scanner(System.in);
            String choose = sc.next();

            switch (choose){
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> findStudent();
                case "4" -> showAll();
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }


    }

    //增
    public static void addStudent(){
        Student student=new Student();
        System.out.println("请输入学生的信息");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生id:");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生地址:");
        String address = sc.next();

        student.setId(id);
        student.setAge(age);
        student.setName(name);
        student.setAddress(address);

        students.add(student);
        System.out.println("添加成功");
    }

    //删
    public static void deleteStudent(){
        System.out.println("请输入要删除的学生的id：");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            Student student=students.get(i);
            if(student.getId()==id){
                students.remove(student);
                System.out.println("删除成功");
            }
        }

    }


    //查
    public static void findStudent(){
        System.out.println("请输入要查找的学生的id：");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            Student student=students.get(i);
            if(student.getId()==id)
                System.out.println("id："+student.getId()+","+"姓名："+student.getName()+
                        ","+"年龄："+student.getAge()+","+"地址："+student.getAddress());
        }
    }

    //遍历
    public static void showAll(){
        System.out.println("所有学生信息如下");
        int t=0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            t=i+1;
            System.out.println("第"+t+"个"+"id："+student.getId()+","+"姓名："+student.getName()+
                    ","+"年龄："+student.getAge()+","+"地址："+student.getAddress());
        }
    }


}
