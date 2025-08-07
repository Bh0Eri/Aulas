package aula_1;

import java.util.Scanner;

public class Aulas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in) ;
		
		String texto = sc.next() ;
		
		int numero;
		
		numero = sc.nextInt();
		
		System.out.println(numero);
		
		System.out.println(texto +" "+ numero);
		sc.close();
		System.out.println("");
	}

}
