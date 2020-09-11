package com.pucjoi.retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Você deve informar dois argumentos..");
        } else {
            Retangulo newRetangulo = new Retangulo();
            try {
                newRetangulo.setComprimento(Double.parseDouble(args[0]));
                newRetangulo.setLargura(Double.parseDouble(args[1]));
                System.out.printf("Área: %.1f\n", newRetangulo.area());
                System.out.printf("Perímetro: %.1f", newRetangulo.perimetro());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
