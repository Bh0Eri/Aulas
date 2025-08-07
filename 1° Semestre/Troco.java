package aulas;

import java.util.Scanner;


public class Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double troco, preco_total, din, qnt, preco;
		
		System.out.print("Insira o preço unitario do produto:");
		preco = sc.nextDouble();
		System.out.print("Quantidade de produtos:");
		qnt = sc.nextDouble();
		preco_total = (qnt*preco); // Preço total
		System.out.print("Dinheiro a pagar:");
		din = sc.nextDouble();
		troco = (din-preco_total); // Calulo do troco
		
		if(din<preco) {    // Caso não possua dinheiro suficiente
			System.out.println("Dinheiro insuficiente!!");
		}
		else {
			System.out.print("Troco:"+String.format("%.2f", troco));
		}
		
		
	}

}
