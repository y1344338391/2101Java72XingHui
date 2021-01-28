package com.daniu101.chapter10.hw1;

public class Person {
    public String name;
    private double height;
    private int age;

    public void setHeight(double height) {
        if(height < 0){
            System.out.println("身高没有负数。");
        }else {
            this.height = height;
        }
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("年龄不能小于0。");
        }else {
            this.age =age;
        }
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void run(){
        System.out.println("跑步");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
