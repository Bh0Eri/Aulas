package Array;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tabela[]= new int[5];
		
		for(int i = 0; i<5;i++) {
			
			System.out.println("Digite o "+(i+1)+"° Numero da tabela");
			tabela[i]= sc.nextInt();
			
			
		}
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i]+ " | ");
		}
	
		}
		
		
	}


