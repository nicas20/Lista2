package com.mycompany.lista2;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        System.out.println("Insira um valor");
        n = sc.nextFloat();
        if (n % 2 == 0) {
            n = n + 5;
        } else {
            n = n + 8;
        }
        System.out.println("N = " + n);
    }
}
