package com.pucjoi.geometria;

public class Quadrado extends Retangulo {

    public double getLado() {
        return base;
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }
}
