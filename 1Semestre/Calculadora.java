package aula_1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int calc;
		double n1, n2, r1;
		System.out.println("Caculadora vida melhor");
		System.out.println("[1] Soma [2] Subtração [3] Dividir [4] Multiplicar [5] Porcentagem");
		calc = sc.nextInt();
		if(calc==1) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			System.out.println(n1+n2);
			
		}
		if(calc==2) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			System.out.println(n1-n2);
		}
		if(calc==3) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			System.out.println(n1/n2);
		}
		if(calc==4) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			System.out.println(n1*n2);
		}
		if(calc==5) {
			System.out.println("Numero?");
			n1 = sc.nextDouble();
			System.out.println("Porcetagem");
			n2 = sc.nextDouble()/100;
			System.out.println(n1*n2);
		}
	}

}
