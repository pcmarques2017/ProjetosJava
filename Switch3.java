package br.com.java;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1: Domingo, ");
		System.out.print("2: Segunda, ");
		System.out.print("3: Terça, ");
		System.out.print("4: Quarta, ");
		System.out.print("5: Quinta, ");
		System.out.print("6: Sexta, ");
		System.out.println("7: Sábado, ");
		
		System.out.println("Entre com um valor de 1 - 7.");
		
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil."); break;
		case 1: 
		case 7: System.out.println("Fim de semana!"); break;
		default: System.out.println("Não é um dia da semana válido!");
		}

	}

}
