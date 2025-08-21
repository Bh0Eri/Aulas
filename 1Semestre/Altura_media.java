package aulas;

import java.util.Scanner;

public class Altura_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome,nome2;
		double alt,alt2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome da primeira:");
		nome = sc.nextLine();
		System.out.print("Nome da segunda:");
		nome2 = sc.nextLine();
		System.out.print("Altura da primeira:");
		alt = sc.nextDouble();
		System.out.print("Altura da segunda:");
		alt2 = sc.nextDouble();
		System.out.println("A Altura media de "+nome+" e "+nome2+" é de:"+String.format("%.1f", (alt+alt2)/2));
		
		
	}

}
