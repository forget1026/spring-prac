package com.Chapter5.ch07;

// java 1.5에서 추가
public class GenericPrinter<T> {
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
