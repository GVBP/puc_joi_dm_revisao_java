package com.pucjoi.fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.err.println("Você deve informar ao menos quatro informações..");
        } else {
            Fatura fatura = new Fatura(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]));
            fatura.printFatura();
        }
    }
}
