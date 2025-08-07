package aula17_02;

import java.util.Scanner;

public class TemperaturaFareheint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double f, c;
		System.out.print("Insira o Fahrenheit:");
		f = sc.nextDouble();
		c = (f-32)*5/9;
		System.out.println("em graus é:"+c);
		
	}

}
