package aula17_02;

import java.util.Scanner;

public class QuestaoE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double valor, taxa, prestacao;
		
		int tempo;
		
		System.out.print("Valor da prestação:");
		valor = sc.nextDouble();                  // Pega o valor da prestação
		
		System.out.print("Taxa da prestação:");
		taxa = sc.nextDouble()/100;               // Pega a taxa e já divide automaticamente
		
		System.out.print("Tempo em meses:");
		tempo = sc.nextInt();                     // Tempo em meses da prestação
		
		prestacao = valor+(valor*taxa*tempo);     // Formula
		
		System.out.println("O valor da prestação é de "+prestacao+"Reais, em "+tempo+" Meses");
	}

}
