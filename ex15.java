package com.mycompany.lista2;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, a3;
        System.out.println("Insira o valor do primeiro ângulo: ");
        a1 = sc.nextInt();
        System.out.println("Insira o valor do segundo ângulo: ");
        a2 = sc.nextInt();
        System.out.println("Insira o valor do terceiro ângulo: ");
        a3 = sc.nextInt();
        if (a1 + a2 + a3 < 180 || a1 + a2 + a3 > 180 || a1 < 0 || a2 < 0 || a3 < 0) {
            System.out.println("Valores inválidos");
        } else {
            if (a1 < 90 && a2 < 90 && a3 < 90) {
                System.out.println("É um triângulo acutângulo.");
            } else if (a1 == 90 || a2 == 90 || a3 == 90) {
                System.out.println("É um triângulo retângulo.");
            } else {
                System.out.println("É um triângulo obtusângulo ");
            }
        }
    }
}
