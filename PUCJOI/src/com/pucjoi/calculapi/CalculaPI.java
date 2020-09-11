package com.pucjoi.calculapi;

public class CalculaPI {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Você deve informar ao menos um número..");
        } else {
            double pi = 4 * (1 - funcRecPI(3, Integer.parseInt(args[0]), true));

            System.out.printf("O valor de PI é %.5f \n", pi);
            System.out.printf("Diferença: %.2f%%", 1 - pi / Math.PI);
        }
    }
    private static double funcRecPI(int position, int denominator, Boolean symbols) {
        if (position >= denominator)
            return (position == denominator) ? 1.0 /denominator : 0.0;
        if (symbols) {
            return (1.0 /position) + funcRecPI(position +2, denominator, false);
        } else {
            return (1.0 /position) - funcRecPI(position +2, denominator, true);
        }
    }
}
