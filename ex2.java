package com.mycompany.lista2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = null, sexo = null, estadoC = null;
        int anos;
        System.out.println("Qual seu nome?");
        nome = sc.next();
        System.out.println("Qual seu sexo?" + "\n" + "F - Feminino" + "\n" + "M - Masculino" + "\n" + "P - Prefiro não dizer");
        sexo = sc.next();
        System.out.println("Qual seu estado civil?" + "\n" + "S - Solteiro(a)" + "\n" + "C - Casado(a)");
        estadoC = sc.next();
        if (sexo.equals("F") && estadoC.equals("C")) {
            System.out.println("Quantos anos de casada?");
            anos = sc.nextInt();
            System.out.println("Parabéns pelo matrimônio. Obrigado pela pesquisa");
        } else {
            System.out.println("Obrigado pela pesquisa!");
        }
    }
}
