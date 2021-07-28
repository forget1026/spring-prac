package com.Chapter3.ch06;

public class GoldCustomer extends Customer {
    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.salesRatio = 0.1;
        this.bonusRatio = 0.02;
        this.customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
