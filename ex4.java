package com.mycompany.lista2;

import java.util.Scanner;

public class ex4  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float a,b;
        double c;
        System.out.println("Digite o valor a");
        a = sc.nextFloat();
        System.out.println("Digite o valor b");
        b = sc.nextFloat();
        if (a == b) {
        	c = a+b;
        } else {
        	c = a*b;
        }
        System.out.println("C = "+c);
	}
}
