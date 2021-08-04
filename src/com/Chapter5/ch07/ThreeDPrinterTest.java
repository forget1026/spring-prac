package com.Chapter5.ch07;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter2 printer = new ThreeDPrinter2();

        printer.setMeterial(powder);
        // Object로 사용하기에는 Casting이 번거롭다.
        Powder p = (Powder) printer.getMeterial();
    }
}
