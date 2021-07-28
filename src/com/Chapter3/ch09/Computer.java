package com.Chapter3.ch09;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void trunOn() {
        System.out.println("전원을 켭니다.");
    }

    public void trunOff() {
        System.out.println("전원을 끕니다.");
    }
}
