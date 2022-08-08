package com.mycompany.lista2;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        float m;
        System.out.println("Quantos lados tem o polígono?");
        l = sc.nextInt();
        if (l < 3) {
            System.out.println("Não é um polígono");
            System.exit(0);
        } else if (l > 5) {
            System.out.println("Polígono não identificado");
            System.exit(0);
        } else if (l == 5) {
            System.out.println("Trata-se de um pentágono.");
            System.exit(0);
        }
        System.out.println("Qual a medida de seu lado?");
        m = sc.nextFloat();
        if (l == 3) {
            System.out.println("Trata-se de um triângulo.");
            System.out.println("Área = " + m + " cm2");
        } else if (l == 4) {
            System.out.println("Trata-se de um quadrado");
            System.out.println("Área = " + m + " cm2");
        }
    }
}
