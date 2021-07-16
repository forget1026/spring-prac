package com.example.ch13;

public class TakeTransTest {
    public static void main(String[] args) {
        Student James = new Student("James", 5000);
        Student Tomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        James.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        Tomas.takeSubway(greenSubway);

        James.showInfo();
        Tomas.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

        Student Edward = new Student("Edward", 20000);

        Taxi taxi = new Taxi("잘나간다 운수");
        Edward.takeTaxi(taxi);

        Edward.showInfo();
        taxi.showTaxiInfo();
    }
}
