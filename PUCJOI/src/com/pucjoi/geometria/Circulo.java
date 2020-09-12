package com.pucjoi.geometria;

public class Circulo extends Forma {

    protected double raio;

    public Circulo() {};

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor, boolean preenchido) {
        this.raio = raio;
        this.cor = cor;
        this.preenchido = preenchido;
    }

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

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                '}';
    }
}
