package com.mycompany.lista2;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        float medida;
        System.out.println("Quantos lados tem o polígono?");
        lado = sc.nextInt();
        System.out.println("Qual a medida de seu lado?");
        medida = sc.nextFloat();
        if (lado == 3) {
            System.out.println("Trata-se de um triângulo.");
            System.out.println("Área = " + medida + " cm2");
        } else if (lado == 4) {
            System.out.println("Trata-se de um quadrado");
            System.out.println("Área = " + medida + " cm2");
        } else if (lado == 5) {
            System.out.println("Trata-se de um pentágono.");
        }
    }
}
