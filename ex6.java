package com.mycompany.lista2;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        System.out.println("Insira um valor");
        n1 = sc.nextFloat();
        System.out.println("Insira um segundo valor");
        n2 = sc.nextFloat();
        System.out.println("Insira um terceiro valor");
        n3 = sc.nextFloat();
        if (n1 < n2 && n1 < n3) {
            System.out.print(n1);
            System.out.print(", ");
            if (n2 < n3) {
                System.out.print(n2 + ", " + n3);
            } else {
                System.out.print(n3 + ", " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            System.out.print(n2);
            System.out.print(", ");
            if (n1 < n3) {
                System.out.print(n1 + ", " + n3);
            } else {
                System.out.print(n3 + ", " + n1);
            }
        } else if (n3 < n2 && n3 < n1) {
            System.out.print(n3);
            System.out.print(", ");
            if (n1 < n2) {
                System.out.print(n1 + ", " + n2);
            } else {
                System.out.print(n2 + ", " + n1);
            }
        }
    }
}
