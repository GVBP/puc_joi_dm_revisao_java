package com.pucjoi.populacaomundial;

public class PopulacaoMundial {
    public static void main(String[] args) {
        long currentWorldPopulation = 7808255900l;
        float annualGrowthRate = 1.5f;
        int currentYear = 2020;

        if (args.length < 1) {
            System.err.println("Você deve informar um número..");
        } else {
            System.out.println("A população mundial no ano "
                    + (currentYear + Integer.parseInt(args[0]))
                    + " é de "
                    + (currentWorldPopulation + ((long) (currentWorldPopulation * ((annualGrowthRate / 100) * Integer.parseInt(args[0])))))
                    + " pessoas..");
        }
    }
}
