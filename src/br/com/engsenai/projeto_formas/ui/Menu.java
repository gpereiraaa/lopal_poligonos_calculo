package br.com.engsenai.projeto_formas.ui;

import java.util.Scanner;

public class Menu {
	
	public void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" ---------------------------------------------");
		System.out.println(" Caluladora de polígonos");
		System.out.println(" ---------------------------------------------");
		System.out.println(" 1 - QUADRADO");
		System.out.println(" 2 - TRIÂNGULO");
		System.out.println(" 3 - TRAPÉZIO");
		System.out.println(" 4 - RETÂNGULO");
		System.out.println(" 5 - CIRCUNFERÊNCIA");
		System.out.println(" 6 - SAIR");
		System.out.println(" ---------------------------------------------");
		System.out.print(" Escolha uma opção (1 - 6): ");
		int opcao = leitor.nextInt();
		System.out.println(" Você escolheu a opção " + opcao);
		
		
	}
	
}
