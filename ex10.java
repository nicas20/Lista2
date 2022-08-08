package com.mycompany.lista2;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l1, l2, l3;
        System.out.println("Insira o valor do primeiro lado");
        l1 = sc.nextFloat();
        System.out.println("Insira o valor do segundo lado");
        l2 = sc.nextFloat();
        System.out.println("Insira o valor do terceiro lado");
        l3 = sc.nextFloat();
        if (l1 == l2 && l1 != l3 || l2 == l3 && l2 != l1 || l2 == l1 && l2 != l3 || l3 == l1 && l3 != l2 || l3 == l2 && l3 != l1) {
            System.out.println("É um triângulo isósceles.");
        } else if (l1 == l2 && l1 == l3) {
            System.out.println("É um triângulo equilátero.");
        } else {
            System.out.println("É um triângulo escaleno.");
        }
    }
}
