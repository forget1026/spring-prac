package com.Chapter5.ch08;

// java 1.5μμ μΆκ°
public class GenericPrinter<T extends Meterial> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return this.material.toString();
    }
}
