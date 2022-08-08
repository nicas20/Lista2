package com.mycompany.lista2;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a, b, c, d;
    
       
        System.out.println("Insira um valor inteiro para A");
        a = scanner.nextInt();
        
        System.out.println("Insira um valor inteiro para B");
        b = scanner.nextInt();
        
        System.out.println("Insira um valor inteiro para C");
        c = scanner.nextInt();
        
        d = a + b;
        if (d < c) {
            System.out.println("A soma de A + B é: " + d + " e é menor que C.");
        }        
    }
}