package aulas;

import java.util.Scanner;

public class Quadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double lar, alt;
		System.out.println("Insira a largura");
		lar = sc.nextDouble();
		System.out.println("Insira a altura");
		alt = sc.nextDouble();
		System.out.println("O perimetro do quadro é "+String.format("%.4f",(lar+alt)+(lar+alt)));
		System.out.println("A area do quadro é "+String.format("%.4f",alt*lar));
		System.out.println("A diagonal do quadro é "+String.format("%.4f",Math.sqrt((alt*alt)+(lar*lar))));
		
	}

}
