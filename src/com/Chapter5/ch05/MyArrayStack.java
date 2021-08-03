package com.Chapter5.ch05;

import com.Chapter5.ch03.MyArray;

public class MyArrayStack {
    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return ;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Emtpy");
            return 0;
        }

        return arrayStack.removeElemet(--top);
    }

    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printAll() {
        arrayStack.printAll();
    }


}
