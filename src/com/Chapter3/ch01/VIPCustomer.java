package com.Chapter3.ch01;

public class VIPCustomer extends Customer{
    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.01;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}