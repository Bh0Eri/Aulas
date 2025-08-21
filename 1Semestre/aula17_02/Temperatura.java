package aula17_02;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double c, f;
		System.out.print("Insira quantos graus são:");
		c = sc.nextDouble();
		f = (c*9/5)+32;
		System.out.println(c+" Graus em Fahrenheit é:"+f);
	}

}
