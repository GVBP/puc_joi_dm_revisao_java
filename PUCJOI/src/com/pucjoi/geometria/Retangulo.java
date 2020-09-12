package com.pucjoi.geometria;

public class Retangulo extends Forma {

    protected double base;
    protected double altura;

    public Retangulo() {};

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura,
                     String cor, boolean preenchido) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                '}';
    }
}
