package Array;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random rm = new Random();
		int tabela[] = new int[8];
		int maior=0, menor=100;
		
		for(int i=0;i<8;i++) {
			tabela[i] += rm.nextInt(1,100);
			if(maior>tabela[i]) {
			}else {
				maior = tabela[i];
			}
			if(menor<tabela[i]) {
				
			}else {
				menor=tabela[i];
			}
			
			
			
			}
		
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i]+" | ");
			
		}
		System.out.println();
		System.out.println("Maior numero é:"+maior);
		System.out.println("Menor numero é:"+menor);
	
			
		

	}

}
