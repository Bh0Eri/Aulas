package aula_1;

import java.util.Scanner;


public class Soma_aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			do {
				double n1,n2,soma;
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				
				soma = (n1+n2);
				
				System.out.println(soma);
				System.out.println("Digite '1' para sair");
				int x;
				x = sc.nextInt();
				if (x==1) {
					sc.close();	
				}	
				
		}while (0<=1);
	}

}
