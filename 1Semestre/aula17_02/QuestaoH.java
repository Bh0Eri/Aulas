package aula17_02;

import java.util.Scanner;

public class QuestaoH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double volume, comprimento, largura, altura;

		System.out.print("Insira o comprimento do retangulo:");
		comprimento = sc.nextDouble();

		System.out.print("Insira a largura:");
		largura = sc.nextDouble();

		System.out.println("Insira a altura:");
		altura = sc.nextDouble();
		
		volume = comprimento*largura*altura;
		
		System.out.println("O volume do retangulo é:"+volume);

	}

}
