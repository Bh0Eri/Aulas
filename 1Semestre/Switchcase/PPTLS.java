package aula19_05;

import java.util.Random;
import java.util.Scanner;

public class PPTLS {// Pedra, Papel, Tesoura, Largato, Spock

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);

		// Regras do jogos
		// Pedra > Largato, Tesoura
		// Papel > Pedra, Spock
		// Tesoura > Largato, Papel
		// Largato > Papel, Spock
		// Spock > Tesoura, Pedra

		System.out.println("Bem vindo jogador(a) ao PPTLS (Pedra,Papel,Tesoura,Largato,Spock!)");
		System.out.print("Insira seu nome:");
		String nome = sc.next();

		System.out.print("Você vai jogar contra nosso robo o nome dele é? ");
		String pc = sc.next();

		int opc = 0, opcpc = 0;
		System.out.println("Vamos começar os jogos");
		System.out.println("O jogo acaba quando o jogador ou o pc perde!");
		System.out.println("Cada um tem 3 vidas, a cada derrota você perde uma");

		int VidaP = 3, VidaPC = 3;
		while (VidaP > 0 && VidaPC > 0) {
			System.out.printf(
					"   Escolha sua jogada! %n [1] Pedra %n [2] Papel %n [3] Tesoura %n [4] Largato %n [5] Spock %n%n[6] Desistir");
			opc = sc.nextInt();
			opcpc = rm.nextInt(1, 5);
			switch (opcpc) {
			case 1:
				System.out.println(pc + " escolheu pedra!");
				break;
			case 2:
				System.out.println(pc + " escolheu papel");
				break;
			case 3:
				System.out.println(pc + " escolheu tesoura");
				break;
			case 4:
				System.out.println(pc + " escolheu largato");
				break;
			case 5:
				System.out.println(pc + " escolheu Spock");
				break;
			}
			switch (opc) {
			case 1:
				System.out.println("Você escolheu pedra!");
				if (opcpc == 2 || opcpc == 5) {
					VidaP -= 1;
					System.out.println("Você perdeu!");
				} else if (opcpc == 3 || opcpc == 4) {
					VidaPC -= 1;
					System.out.println("Você ganhou!");
				} else {
					System.out.println("Empate!");
				}
				break;
			case 2:
				System.out.println("Você escolheu papel");
				if (opcpc == 3 || opcpc == 4) {
					VidaP -= 1;
					System.out.println("Você perdeu!");
				} else if (opcpc == 1 || opcpc == 5) {
					VidaPC -= 1;
					System.out.println("Você ganhou!");
				} else {
					System.out.println("Empate!");
				}
				break;
			case 3:
				System.out.println("Você escolheu tesoura");
				if (opcpc == 1 || opcpc == 5) {
					VidaP -= 1;
					System.out.println("Você perdeu!");
				} else if (opcpc == 2 || opcpc == 4) {
					VidaPC -= 1;
					System.out.println("Você ganhou!");
				} else {
					System.out.println("Empate!");
				}
				break;
			case 4:
				System.out.println("Você escolheu largato");
				if (opcpc == 1 || opcpc == 3) {
					VidaP -= 1;
					System.out.println("Você perdeu!");
				} else if (opcpc == 2 || opcpc == 5) {
					VidaPC -= 1;
					System.out.println("Você ganhou!");
				} else {
					System.out.println("Empate!");
				}
				break;
			case 5:
				System.out.println("Você escolheu Spock");
				if (opcpc == 2 || opcpc == 4) {
					VidaP -= 1;
					System.out.println("Você perdeu!");
				} else if (opcpc == 1 || opcpc == 3) {
					VidaPC -= 1;
					System.out.println("Você ganhou!");
				} else {
					System.out.println("Empate!");
				}
				break;
			case 6:
				VidaP -= 3;
				System.out.println("Player desistiu");
			}
			System.out.println(pc + " Vida:" + VidaPC);
			System.out.println(nome + " Vida:" + VidaP);

		}
		if (VidaP == 0) {
			System.out.println(pc + " GANHOU!!");
		} else if (VidaPC == 0) {
			System.out.println(nome + " GANHOU!!");
		} else {
		}

	}

}
