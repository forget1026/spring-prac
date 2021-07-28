package com.Chapter3.ch16;

public class SuperLevel extends PlayerLevel {
    @Override
    void run() {
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 Jump 할 수 있습니다..");
    }

    @Override
    void turn() {
        System.out.println("Trun 할 수 있습니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
