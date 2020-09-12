package com.pucjoi.geometria;

public class GeometriaTeste {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.err.println("Você deve informar quatro números..");
        } else {
            // $ java GeometriaTeste 2 3 4 5

            // Área Círculo: 12.5663706144
            // Perímetro Círculo: 12.5663706144
            Forma circulo = new Circulo(Double.parseDouble(args[0]));
            System.out.printf("Área Círculo: %.2f\n", circulo.getArea());
            System.out.printf("Perímetro Círculo: %.2f\n", circulo.getPerimetro());
            // Área Retângulo: 12
            // Perímetro Retângulo: 14
            Forma retangulo = new Retangulo(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
            System.out.printf("Área Retângulo: %.2f\n", retangulo.getArea());
            System.out.printf("Perímetro Retângulo: %.2f\n", retangulo.getPerimetro());
            // Área Quadrado: 25
            // Perímetro Quadrado:  20
            Forma quadrado = new Quadrado(Double.parseDouble(args[3]));
            System.out.printf("Área Quadrado: %.2f\n", quadrado.getArea());
            System.out.printf("Perímetro Quadrado: %.2f\n", quadrado.getPerimetro());
        }
    }
}
