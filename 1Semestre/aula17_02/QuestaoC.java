package aula17_02;

import java.util.Scanner;

public class QuestaoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double volume, raio, altura, pi, raio2;
		
		pi = 3.14159;  // Valor de PI para o calculo
		
		System.out.print("Insira o raio:");
		raio = sc.nextDouble();
		
		raio2 = raio*raio; // Raio ao quadrado
		
		System.out.print("Insira a altura:");
		altura = sc.nextDouble();
		
		volume = pi*(raio2*altura); // Formula
		
		
		System.out.print("O volume:"+volume);
	}

}
