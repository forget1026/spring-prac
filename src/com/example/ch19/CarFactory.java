package com.example.ch19;

public class CarFactory {
    private static int carNum;
    private static CarFactory carInstance;

    private CarFactory() {
        this.carNum = 10001;
    }

    public static CarFactory getCarInstance() {
        if (carInstance == null)
            carInstance = new CarFactory();
        return carInstance;
    }

    public Car createCar() {
        return new Car(carNum++);
    }
}
