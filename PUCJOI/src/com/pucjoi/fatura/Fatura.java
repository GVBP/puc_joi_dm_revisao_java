package com.pucjoi.fatura;

public class Fatura {
    private String codFatura;
    private String description;
    private int itemQuantity;
    private double itemPrice;

    public Fatura(String codFatura, String description,
                  int itemQuantity, double itemPrice) {
        this.codFatura = codFatura;
        this.description = description;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
    public double totalFaturado() {
        return itemQuantity * itemPrice;
    }
    public void printFatura() {
        System.out.println("Código: " + codFatura);
        System.out.println("Descrição: " + description);
        System.out.printf("Total: R$ %.2f", totalFaturado());
    }
}
