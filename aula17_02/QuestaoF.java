package aula17_02;

import java.util.Scanner;

public class QuestaoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Valor de A:");
		a = sc.nextDouble();
		System.out.print("Valor de B:");
		b = sc.nextDouble();
		
		c = b; // A variavel C guarda o valor de B
		b = a; // B pega o valor de A
		a = c; // A pega o valor antigo de B guardado em C
		
		System.out.println("Trocando so valores são: Valor de A:"+a+" Valor de B:"+b);
	}

}
