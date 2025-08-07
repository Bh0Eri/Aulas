package aula17_02;

import java.util.Scanner;

public class QuestaoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double litro, tempo, velocidade, distancia, litros_usados;
		
		System.out.print("Tempo gasto:");
		tempo = sc.nextDouble();
		
		System.out.print("Velocidade media em KM/H:");
		velocidade = sc.nextDouble();
		
		distancia = velocidade * tempo;
		
		System.out.println("Distancia percorrida:" + distancia);
		litros_usados = distancia / 12;
		
		System.out.println(litros_usados + " Litros usados");
		System.out.println(tempo + " Tempo gasto na viagem");
		System.out.println(velocidade + " Velocidade média da viagem");

	}

}
