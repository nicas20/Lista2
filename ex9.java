package com.mycompany.lista2;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo;
		float altura, pesoI;
		System.out.println("Por favor, informe seu sexo" + "\n" + "M - Masculino" + "\n" + "F - Feminino");
		sexo = sc.next();
		System.out.println("Qual sua altura?");
		altura = sc.nextFloat();
		if (sexo.equals("M")) {
			pesoI = (float) ((72.7 * altura)-58);
			System.out.println("Seu peso ideal é: "+pesoI+ " kg.");
		} else {
			pesoI = (float) (62.1 * altura)-44;
			System.out.println("Seu peso ideal é: "+pesoI+" kg.");
		}
	}
}