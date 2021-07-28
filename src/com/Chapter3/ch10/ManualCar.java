package com.Chapter3.ch10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 차를 멈춥니다.");
    }

    @Override
    public void wiper() {

    }
}
