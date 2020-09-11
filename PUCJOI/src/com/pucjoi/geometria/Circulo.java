package com.pucjoi.geometria;

public class Circulo extends Forma {

    protected double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
