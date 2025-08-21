package aula17_02;

import java.util.Scanner;

public class QuestaoG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d, escolha;
		System.out.println("Insira 4 valores!");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("as somas são:");
		System.out.println(a+b); 
		System.out.println(a+c);
		System.out.println(a+d);
		System.out.println(b+c);
		System.out.println(b+d);
		System.out.println(c+d);
		
		System.out.println("As multiplações são:");
		System.out.println(a*b);
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(b*c);
		System.out.println(b*d);
		System.out.println(c*d);
		
		
	}

}
