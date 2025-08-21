package aula_1;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bom dia");
		Scanner sc = new Scanner (System.in);
		double x, y, media;
		System.out.println("Digite o primeiro numero!");
		x = sc.nextDouble();
		System.out.println("Digite o segundo numero!");
		y = sc.nextDouble();
		media = (x + y) / 2.0;
		System.out.println("media é " + media);
		
		
	}

}
