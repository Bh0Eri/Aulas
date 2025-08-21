package aulas;

import java.util.Scanner;

public class Piso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double lar, com, price;
		
		System.out.println("Insira a largura");
		lar = sc.nextDouble();
		System.out.println("Insira o comprimento");
		com = sc.nextDouble();
		System.out.println("A área da casa é: "+lar*com);
		System.out.println("Insira o valor do m² do piso");
		price = sc.nextDouble();
		System.out.println("Custo total do piso será! "+String.format("%.2f",price*(lar*com)));
		
		
	}

}
