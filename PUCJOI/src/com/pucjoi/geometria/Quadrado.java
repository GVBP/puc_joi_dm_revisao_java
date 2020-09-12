package com.pucjoi.geometria;

public class Quadrado extends Retangulo {

    public Quadrado() {};

    public Quadrado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        this.base = lado;
        this.altura = lado;
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public double getLado() {
        return altura;
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimetro() {
        return super.getPerimetro();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
