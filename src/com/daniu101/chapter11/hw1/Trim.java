package com.daniu101.chapter11.hw1;

public class Trim {
    public static void main(String[] args) {
        String a ="abc";
        String b = "  abc";
        System.out.println(a.equals(b));
        b = b.trim();
        System.out.println(a.equals(b));
    }
}
