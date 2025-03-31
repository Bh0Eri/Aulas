package Array;

import java.util.Random;

public class Exercico4 {

	public static void main(String[] args) {
		Random rm = new Random();
		int tabela[] = new int[10];
		int par=0;
		
		for(int i=0;i<10;i++) {
			
			tabela[i] = rm.nextInt(1,100);
			System.out.print(tabela[i]+" | ");
			if(tabela[i]%2==1) {
			}else {
				par++;
			}
			
		}
		System.out.println();
		System.out.println("Tem numeros pares "+ par);
	}

}
