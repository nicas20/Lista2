package com.mycompany.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float n1, n2, n3, me, ma;
        int id;
        String nota = null;
        System.out.println("Insira seu número de identifiação");
        id = sc.nextInt();
        System.out.println("Inisra a 1º nota");
        n1 = sc.nextFloat();
        System.out.println("Insira a 2º nota");
        n2 = sc.nextFloat();
        System.out.println("Insira a 3º nota");
        n3 = sc.nextFloat();
        me = (float) ((n1 + n2 + n3) / 3);
        ma = (float) (((n1 + n2) * 2 + (n3 * 3) + me) / 7);
        if (ma >= 90) {
            nota = "A";
        } else if (ma >= 75 && ma < 90) {
            nota = "B";
        } else if (ma >= 60 && ma < 75) {
            nota = "C";
        } else if (ma >= 40 && ma < 60) {
            nota = "D";
        } else if (ma < 40) {
            nota = "E";
        }
        System.out.println("As notas do aluno " + id + " foram:" + "\n" + "Nota 1: " + n1 + " | Nota 2: " + n2 + " | Nota 3: " + n3);
        System.out.println("A média dos exercícios foi de: " + df.format(me));
        System.out.println("A média da de aproveitamento foi de: " + df.format(ma) + " gerando o conceito " + nota);
    }
}
