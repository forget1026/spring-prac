package com.Chapter4.ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String andoroid = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(andoroid);
        System.out.println(System.identityHashCode(buffer));

        String test = buffer.toString();
        System.out.println(test);
    }
}
