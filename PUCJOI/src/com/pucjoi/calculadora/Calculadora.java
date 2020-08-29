package com.pucjoi.calculadora;

public class Calculadora {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Você deve informar ao menos dois números..");
        } else {
            int argOne = Integer.parseInt(args[0]);
            int argTwo = Integer.parseInt(args[1]);

            prints("Soma", Integer.toString((argOne+argTwo)));
            prints("Produto", Integer.toString((argOne*argTwo)));
            prints("Diferença", Integer.toString((argOne-argTwo)));
            prints("Divisão", Integer.toString((int)(argOne/argTwo)));

            String title = (argOne != argTwo) ? "Maior número" : "Números iguais";
            String content = (argOne >= argTwo) ? args[0] : args[1];

            prints(title, content);
        }
    }
    private static void prints(String title, String content) {
        System.out.println(title + ": " + content);
    }
}
