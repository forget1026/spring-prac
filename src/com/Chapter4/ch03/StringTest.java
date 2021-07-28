package com.Chapter4.ch03;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String andoroid = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(andoroid);

        System.out.println(System.identityHashCode(java));
        System.out.println(java);
    }
}
