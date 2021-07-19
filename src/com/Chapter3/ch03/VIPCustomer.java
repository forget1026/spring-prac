package com.Chapter3.ch03;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        super(0, "no-name");

        bonusRatio = 0.05;
        salesRatio = 0.01;
        customerGrade = "VIP";

        System.out.println("VIP Customer Call");
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.01;
        customerGrade = "VIP";
        System.out.println("VIP Customer(int, String) Call");
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
