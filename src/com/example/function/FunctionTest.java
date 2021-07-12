package com.example.function;

public class FunctionTest {
    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        System.out.println(addNum(n1, n2));
        sayHello("Hydreamer");
        System.out.println(calcSum());
    }
}
