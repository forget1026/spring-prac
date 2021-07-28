package com.Chapter3.ch16;

public class AdvanceLevel extends PlayerLevel {
    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("Jump 할 수 있습니다..");
    }

    @Override
    void turn() {
        System.out.println("Trun 할 수 없습니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}
