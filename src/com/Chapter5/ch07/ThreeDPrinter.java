package com.Chapter5.ch07;

public class ThreeDPrinter {
    private Powder meterial;

    public Powder getMeterial() {
        return meterial;
    }

    public void setMeterial(Powder meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "meterial=" + meterial +
                '}';
    }
}
