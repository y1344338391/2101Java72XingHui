package com.daniu101.chapter11.hw3;
//编程
public class Program extends Field{
    private String p;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Program{" +
                "p='" + p + '\'' +
                '}';
    }
}
