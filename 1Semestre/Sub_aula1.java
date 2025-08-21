package aula_1;

import java.util.Scanner;

public class Sub_aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,r;
		n1 = sc.nextInt();
		r = (n1%2);
		if(r==1) {
			System.out.println("O numero "+n1+" é Impar");
		}
		else {
			System.out.println("O numero "+n1+" é par");
		}
		
		
	}

}
