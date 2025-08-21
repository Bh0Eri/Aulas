package aula19_05;

import java.util.Scanner;

public class Moedas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opc = 0, coinopc=0;
		double valortotal=0;
		while (opc!=7) {
		System.out.printf("Qual moedas você colocou no cofrinho? %n [1] 0,01 Centavo %n [2] 0,05 Centavo %n [3] 0.10 Centavo %n [4] 0,25 Centavo %n [5] 0,50 Centavo %n [6] 1 Real %n [7] Não colocou mais moedas %n");
		opc = sc.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 0,01 Centavo");
			valortotal += coinopc*0.05;
			break;
		case 2:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 0,05 Centavo");
			valortotal += coinopc*0.05;
			break;
		case 3:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 0,10 Centavo");
			valortotal += coinopc*0.1;
			break;
		case 4:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 0,25 Centavo");
			valortotal += coinopc*0.25;
			break;
		case 5:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 0,50 Centavo");
			valortotal += coinopc*0.5;
			break;
		case 6:
			System.out.println("Quantas moedas você colocou?");
			coinopc = sc.nextInt();
			System.out.printf("Você colocou ",coinopc," De moedas de 1 real");
			valortotal += coinopc*1;
			break;
		case 7:
			System.out.println("Ok, Calculando total de moedas");
		}
		}
		System.out.println("O valor total de moedas é:"+valortotal);
		if(valortotal<100) {
			double sobra = valortotal-100;
			System.out.println("Você precisa ainda de R$"+sobra+" para 100 reais");
		}else {
		System.out.println("Você tem mais de 100 reais");
		}
	}

}
