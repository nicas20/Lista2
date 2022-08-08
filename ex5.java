package com.mycompany.lista2;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        System.out.println("Insira um valor: ");
        n = sc.nextFloat();
        if (n > 0) {
            n = n * 2;
        } else {
            n = n * 3;
        }
        System.out.println("O resultado foi " + n);
    }
}
