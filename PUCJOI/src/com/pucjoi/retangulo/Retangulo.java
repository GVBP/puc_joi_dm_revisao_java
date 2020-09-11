package com.pucjoi.retangulo;

public class Retangulo {

    private double comprimento = 1;
    private double largura = 1;

    public double perimetro() {
        return 2 * (this.comprimento + this.largura);
    }

    public double area() {
        return this.comprimento * this.largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0.0) {
            this.comprimento = comprimento;
        } else {
            throw new IllegalArgumentException("O número passado não é maior que 0.0");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (comprimento > 0.0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("O número passado não é maior que 0.0");
        }
    }
}
