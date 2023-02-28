package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = "";
	    System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite sua média: ");
		double media = sc.nextDouble();
		System.out.println("- NOME: "+nome+"\n- IDADE: "+idade+"\n- MÉDIA: "+media);
		
		
	}

}
